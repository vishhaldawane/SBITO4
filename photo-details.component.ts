import { Component, OnInit } from '@angular/core';
import { UserDetailsService } from '../user-details.service';

@Component({
  selector: 'app-photo-details',
  templateUrl: './photo-details.component.html',
  styleUrls: ['./photo-details.component.css']
})
export class PhotoDetailsComponent implements OnInit {

  constructor(private uds: UserDetailsService) { }

  myPhotos: any[]=[];

  
  ngOnInit(): void {
    this.uds.findAllPhotos().subscribe
    (
      {
        next: (data: any[]) =>  {
          this.myPhotos = data;
          console.log(data);
        },
        complete: () => {},
        error: () => { console.log(console.error()); }
      }
   );
  }

}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserDetailsService {

  baseURL = "https://jsonplaceholder.typicode.com/photos/";

  constructor(private myHttp: HttpClient) { }

  findAllPhotos() : Observable<any[]> {
    return this.myHttp.get<any[]>(this.baseURL);
  }

  findSinglePhoto(photoId:number) : Observable<any> {
    return this.myHttp.get<any>(this.baseURL+photoId);
  }
}


public class AssociationTest {
	public static void main(String[] args) {
		Lyrics ly = new Lyrics();
		ly.setLyricist("Amitabh Bhattacharya");
		ly.setTheLyrics("Abhi Mujh Mein Kahin");
		
		Music m = new Music();
		m.setMusicianName("Ajay Atul");
		m.setMusicNotes("Romantic Notes...");
		
		Singer singer = new Singer();
		singer.setSingerName("Sonu Nigam");
		singer.setArtType("Classical Singer");
		singer.voice.setClarity("Clear");
		singer.voice.setPitchRange("high");
		singer.voice.setPoise("Amazing");
		
		Song song = singer.sing(ly,m,"Agnipath",2022,"Abhi Mujh Mein Kahin");
		System.out.println("song "+song);
		
		System.out.println("song  : "+singer);
		System.out.println("lyrics: "+ly);
		System.out.println("music : "+m);
	}
}

class Artist
{
	String artType;

	public String getArtType() {
		return artType;
	}

	public void setArtType(String artType) {
		this.artType = artType;
	}

	@Override
	public String toString() {
		return "Artist [artType=" + artType + "]";
	}
	
	
}

class Singer extends Artist //isA
{
	Voice voice = new Voice();
	String singerName;
	
	//producesA		usesA		usesA
		Song sing(Lyrics lyrics, Music m, String album, int year, String songTitle) {
	
			Song s = new Song();
			s.setArtist(singerName);
			s.setAlbum(album);
			s.setYear(year);
			s.setTitle(songTitle);
			return s;
		}

		public Voice getVoice() {
			return voice;
		}

		public void setVoice(Voice voice) {
			this.voice = voice;
		}

		public String getSingerName() {
			return singerName;
		}

		public void setSingerName(String singerName) {
			this.singerName = singerName;
		}

		@Override
		public String toString() {
			return "Singer [voice=" + voice + ", singerName=" + singerName + "]";
		}
		
		
}

class Voice {
	String clarity;
	String poise;
	String pitchRange;
	public String getClarity() {
		return clarity;
	}
	public void setClarity(String clarity) {
		this.clarity = clarity;
	}
	public String getPoise() {
		return poise;
	}
	public void setPoise(String poise) {
		this.poise = poise;
	}
	public String getPitchRange() {
		return pitchRange;
	}
	public void setPitchRange(String pitchRange) {
		this.pitchRange = pitchRange;
	}
	@Override
	public String toString() {
		return "Voice [clarity=" + clarity + ", poise=" + poise + ", pitchRange=" + pitchRange + "]";
	}
	
	
}

class Lyrics {
	String lyricist;
	String theLyrics;
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	public String getTheLyrics() {
		return theLyrics;
	}
	public void setTheLyrics(String theLyrics) {
		this.theLyrics = theLyrics;
	}
	@Override
	public String toString() {
		return "Lyrics [lyricist=" + lyricist + ", theLyrics=" + theLyrics + "]";
	}

}
class Music {
	String musicianName;
	String musicNotes;
	public String getMusicianName() {
		return musicianName;
	}
	public void setMusicianName(String musicianName) {
		this.musicianName = musicianName;
	}
	public String getMusicNotes() {
		return musicNotes;
	}
	public void setMusicNotes(String musicNotes) {
		this.musicNotes = musicNotes;
	}
	@Override
	public String toString() {
		return "Music [musicianName=" + musicianName + ", musicNotes=" + musicNotes + "]";
	}
	
}
class Song {
	String title;
	String album;
	String artist;
	int year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}
	
	
}

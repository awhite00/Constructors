
public class Song
	{
			
			public static int setSeconds;
			private String title;
			private String artist;
			private  int seconds;
			public Song (String ti, String art, int sec)
				{
					title=ti;
					artist=art;
					seconds=sec;
				}
			
			public String getTitle()
				{
					return title;
				}
			public void setTitle(String title)
				{
					this.title = title;
				}
			public String getArtist()
				{
					return artist;
				}
			public void setArtist(String artist)
				{
					this.artist = artist;
				}
			public int getSeconds()
				{
					return seconds;
				}
			public void setSeconds(int seconds)
				{
					this.seconds = seconds;
				}

			public int setSeconds()
				{
					// TODO Auto-generated method stub
					return 0;
				}
				
				

			}

	

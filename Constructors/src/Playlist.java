
import java.util.ArrayList;




public class Playlist
{
 static  ArrayList<Song>playlist=new ArrayList<Song>();
	public static void main(String[] args)
	{
		
			
				
				
				playlist.add(new Song("Don't Stop Believing,  ", "Journey,  ", 250 ));
				playlist.add(new Song("Again,  ", "Fetty Wap,  ", 180));
				playlist.add(new Song ("Cruise,  ", "Florida Georgia Line,  ", 200 ));
				playlist.add(new Song ("Ignition,  ", "R.Kelly,  ", 195));
				playlist.add(new Song ("Uptown Girl,  ", "Billy Joel,  ", 300));
				
			printlist();
			printseconds();	
			printlist();
			cutlongesttitle();
			printlist();
			makemeastar();
			printlist();
	}
				
		
			
		

			public static void	printlist()
					{
					
				for (int i=0; i<playlist.size(); i++)
					{
						
						System.out.println(playlist.get(i).getTitle() + playlist.get(i).getArtist() + playlist.get(i).getSeconds());
						
						
						
					}
				
				
	
		
		}
		public static void printseconds()
			{
				for(int i=0; i<playlist.size(); i++)
					{
				playlist.get(i).setSeconds((playlist.get(i).getSeconds())-10);
					}
				System.out.println();
			}
		public static void cutlongesttitle()
			{
				int longestTitleLength=playlist.get(0).getTitle().length();
				for (int i=0; i<playlist.size(); i++)
					{
						if (playlist.get(i).getTitle().length()>longestTitleLength)
							{
								longestTitleLength=playlist.get(i).getTitle().length();
							}
							
								
					}
					for (int i=0; i<playlist.size(); i++)
						{
							if ((playlist.get(i).getTitle().length())==longestTitleLength)
								
								{
									playlist.remove(i);
								}
								
						}
					
				System.out.println();
			}
					
						
	public static void makemeastar()
		{
			playlist.get(0).setArtist ("Ally White ");
			System.out.println();
		}
						
		}
			
				
			


			



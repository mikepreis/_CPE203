package comparator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;

public class TestCases
{
   private static final Song[] songs = new Song[] {
         new Song("Decemberists", "The Mariner's Revenge Song", 2005),
         new Song("Rogue Wave", "Love's Lost Guarantee", 2005),
         new Song("Avett Brothers", "Talk on Indolence", 2006),
         new Song("Gerry Rafferty", "Baker Street", 1998),
         new Song("City and Colour", "Sleeping Sickness", 2007),
         new Song("Foo Fighters", "Baker Street", 1997),
         new Song("Queen", "Bohemian Rhapsody", 1975),
         new Song("Gerry Rafferty", "Baker Street", 1978)
      };
   @Test
   public void testArtistComparator()
   {
      ArtistComparator artistComparator = new ArtistComparator();
      if ( artistComparator.compare(songs[5], songs[6]) < 0 ) {
         System.out.println(songs[5].getArtist());
      } else if ( artistComparator.compare(songs[5], songs[6]) > 0 ) {
         System.out.println(songs[6].getArtist());
      } else {
         System.out.println("Artist is the same");
      }
   }

   @Test
   public void testLambdaTitleComparator()
   {
      Comparator<Song> titleComparator = (Song s1, Song s2) -> (s1.getTitle().compareTo(s2.getTitle()));
      if ( titleComparator.compare(songs[5], songs[6]) < 0 ) {
         System.out.println(songs[5].getTitle());
      } else if ( titleComparator.compare(songs[5], songs[6]) > 0 ) {
         System.out.println(songs[6].getTitle());
      } else {
         System.out.println("Title is the same");
      }
   }

   @Test
   public void testYearExtractorComparator()
   {
      
   }

   @Test
   public void testComposedComparator()
   {
   }

   @Test
   public void testThenComparing()
   {
   }

   @Test
   public void runSort()
   {
      List<Song> songList = new ArrayList<>(Arrays.asList(songs));
      List<Song> expectedList = Arrays.asList(
         new Song("Avett Brothers", "Talk on Indolence", 2006),
         new Song("City and Colour", "Sleeping Sickness", 2007),
         new Song("Decemberists", "The Mariner's Revenge Song", 2005),
         new Song("Foo Fighters", "Baker Street", 1997),
         new Song("Gerry Rafferty", "Baker Street", 1978),
         new Song("Gerry Rafferty", "Baker Street", 1998),
         new Song("Queen", "Bohemian Rhapsody", 1975),
         new Song("Rogue Wave", "Love's Lost Guarantee", 2005)
         );

      //songList.sort(
         // pass comparator here
      //);

      assertEquals(songList, expectedList);
   }
}

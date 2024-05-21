package org.example.music;

public class PopMusicList extends MusicList {

    public PopMusicList() {
        songs.add(new GameMusic("Shape of You", "The club isn't the best place to find a lover So the bar is where I go", "Girl, you know I want your love", "Ed Sheeran"));
        songs.add(new GameMusic("Love Yourself", "For all the times that you rain on my parade", "You think you broke my heart, oh girl for goodness sake", "Justin Bieber"));
        songs.add(new GameMusic("Bad Guy", "White shirt now red, my bloody nose", "I'm that bad type, make your mama sad type", "Billie Eilish"));
        songs.add(new GameMusic("Rolling in the Deep", "There's a fire starting in my heart", "We could have had it all", "Adele"));
        songs.add(new GameMusic("Uptown Funk", "This hit, that ice cold Michelle Pfeiffer, that white gold", "Don't believe me, just watch", "Mark Ronson ft. Bruno Mars"));
        songs.add(new GameMusic("Shake It Off", "I stay out too late, got nothing in my brain", "And the players gonna play, play, play, play, play", "Taylor Swift"));
        songs.add(new GameMusic("Someone Like You", "I heard that you're settled down", "Never mind, I'll find someone like you", "Adele"));
        songs.add(new GameMusic("Call Me Maybe", "Hey, I just met you, and this is crazy", "But here's my number, so call me maybe", "Carly Rae Jepsen"));
        songs.add(new GameMusic("Roar", "I used to bite my tongue and hold my breath", "I got the eye of the tiger, a fighter", "Katy Perry"));
        songs.add(new GameMusic("Firework", "Do you ever feel like a plastic bag", "You're a firework, come on, show 'em what you're worth", "Katy Perry"));
        songs.add(new GameMusic("Sorry", "You gotta go and get angry at all of my honesty", "Is it too late now to say sorry?", "Justin Bieber"));
        songs.add(new GameMusic("Dark Horse", "I knew you were, you were gonna come to me", "So you wanna play with magic", "Katy Perry ft. Juicy J"));
        songs.add(new GameMusic("All About That Bass", "Because you know I'm all about that bass", "'Cause every inch of you is perfect from the bottom to the top", "Meghan Trainor"));
        songs.add(new GameMusic("Sugar", "I'm hurting, baby, I'm broken down", "And I need your loving, loving, I need it now", "Maroon 5"));
        songs.add(new GameMusic("Closer", "Hey, I was doing just fine before I met you", "So baby pull me closer in the back seat of your Rover", "The Chainsmokers ft. Halsey"));
        songs.add(new GameMusic("Senorita", "I love it when you call me señorita", "I wish I could pretend I didn't need ya", "Shawn Mendes & Camila Cabello"));
        songs.add(new GameMusic("Blank Space", "I could show you incredible things", "Love's a game, wanna play?", "Taylor Swift"));
        songs.add(new GameMusic("2002", "I will always remember. The day you kissed my lips", "Dancing on the hood in the middle of the woods on an old mustang", "Anne Marie"));
        songs.add(new GameMusic("The Fox", "Dog goes woof Cat goes meow", "Fraka-kaka-kaka-kaka-kow!", "Ylvis"));
        songs.add(new GameMusic("Dance Monkey", "They say, oh my God I see the way you shine", "Ooh, I see you, see you, see you every time", "Tones And I"));
        songs.add(new GameMusic("Love On Top", "Honey, honey I can see the stars all the way from here", "Baby, it's you. You're the one I love", "Tones And I"));
    }

    @Override
    protected String getListName() {
        return "팝송";
    }
}
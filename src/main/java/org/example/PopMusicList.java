package org.example;

public class PopMusicList {
    private GameMusic[] songs;

    public PopMusicList() {
        songs = new GameMusic[]{
                new GameMusic("Shape of You", "The club isn't the best place to find a lover So the bar is where I go", "Girl, you know I want your love", "Ed Sheeran"),
                new GameMusic("Love Yourself", "For all the times that you rain on my parade", "You think you broke my heart, oh girl for goodness sake", "Justin Bieber"),
                new GameMusic("Blinding Lights", "I've been tryna call I've been on my own for long enough", "I said, ooh, I'm blinded by the lights", "The Weeknd"),
                new GameMusic("Bad Guy", "White shirt now red, my bloody nose", "I'm that bad type, make your mama sad type", "Billie Eilish"),
                new GameMusic("Rolling in the Deep", "There's a fire starting in my heart", "We could have had it all", "Adele"),
                new GameMusic("Uptown Funk", "This hit, that ice cold Michelle Pfeiffer, that white gold", "Don't believe me, just watch", "Mark Ronson ft. Bruno Mars"),
                new GameMusic("Can't Stop the Feeling", "I got this feeling inside my bones", "Nothing I can see but you when you dance, dance, dance", "Justin Timberlake"),
                new GameMusic("Shake It Off", "I stay out too late, got nothing in my brain", "And the players gonna play, play, play, play, play", "Taylor Swift"),
                new GameMusic("Someone Like You", "I heard that you're settled down", "Never mind, I'll find someone like you", "Adele"),
                new GameMusic("Happy", "It might seem crazy what I'm 'bout to say", "Clap along if you feel like a room without a roof", "Pharrell Williams"),
                new GameMusic("Thinking Out Loud", "When your legs don't work like they used to before", "And I can't sweep you off of your feet", "Ed Sheeran"),
                new GameMusic("Call Me Maybe", "Hey, I just met you, and this is crazy", "But here's my number, so call me maybe", "Carly Rae Jepsen"),
                new GameMusic("Roar", "I used to bite my tongue and hold my breath", "I got the eye of the tiger, a fighter", "Katy Perry"),
                new GameMusic("Firework", "Do you ever feel like a plastic bag", "You're a firework, come on, show 'em what you're worth", "Katy Perry"),
                new GameMusic("Sorry", "You gotta go and get angry at all of my honesty", "Is it too late now to say sorry?", "Justin Bieber"),
                new GameMusic("Dark Horse", "I knew you were, you were gonna come to me", "So you wanna play with magic", "Katy Perry ft. Juicy J"),
                new GameMusic("All About That Bass", "Because you know I'm all about that bass", "'Cause every inch of you is perfect from the bottom to the top", "Meghan Trainor"),
                new GameMusic("Sugar", "I'm hurting, baby, I'm broken down", "And I need your loving, loving, I need it now", "Maroon 5"),
                new GameMusic("Havana", "Havana, ooh na-na (ay)", "Half of my heart is in Havana, ooh-na-na", "Camila Cabello ft. Young Thug"),
                new GameMusic("Closer", "Hey, I was doing just fine before I met you", "So baby pull me closer in the back seat of your Rover", "The Chainsmokers ft. Halsey"),
                new GameMusic("Senorita", "I love it when you call me señorita", "I wish I could pretend I didn't need ya", "Shawn Mendes & Camila Cabello"),
                new GameMusic("Cheap Thrills", "Come on, come on, turn the radio on", "Baby I don't need dollar bills to have fun tonight", "Sia"),
                new GameMusic("Despacito", "Despacito Quiero respirar tu cuello despacito", "Pasito a pasito, suave suavecito", "Luis Fonsi ft. Daddy Yankee")
        };
    }

    public GameMusic[] getSongs() {
        return songs;
    }
}

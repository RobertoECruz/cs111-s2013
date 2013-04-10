public class SpriteTest {
	public static void main(String args[]) {
		Animation movie = new Animation(800,600);
		movie.setFrameRate(20);
		movie.setBackgroundImage("images.jpg");
		movie.frameFinished();

		Sprite s =  new Sprite("sprite2.jpg");
		s.setSize(50,100);
		s.setPosition(400-(s.getXsize()/2), 300-(s.getYsize()/2));
		movie.addSprite(s);


		Sprite p = new Sprite(s);
		p.setPosition(0,0);
		movie.addSprite(p);
		movie.frameFinished();

		int inc=1;
		while (s.getXposition() < (800-s.getXsize()) && s.getYposition() < (600-s.getYsize()) 
			&& s.getYposition() > 0 && s.getXposition() > 0){
			p.setPosition(p.getXposition()+1,p.getYposition()+1);
			s.setPosition(s.getXposition()+inc,s.getYposition());
			inc++;
			movie.frameFinished();
			s.setPosition(s.getXposition(),s.getYposition()+inc);
			inc++;
			movie.frameFinished();
			s.setPosition(s.getXposition()-inc,s.getYposition());
			inc++;
			movie.frameFinished();
			s.setPosition(s.getXposition(),s.getYposition()-inc);
			inc++;
			movie.frameFinished();
		}
	}
}

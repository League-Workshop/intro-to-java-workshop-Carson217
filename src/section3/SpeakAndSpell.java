package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("Spell League");
		// 2. Catch the user's answer in a String
String a = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
if (a.equals("League")) {
	
	
	JOptionPane.showMessageDialog(null, "Correct. " );
}
		// 4. Otherwise say "wrong"
else {JOptionPane.showMessageDialog(null, "WRONG! " );}
		// 5. repeat the process for other words
//1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("Spell Carson");
		// 2. Catch the user's answer in a String
String d = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
if (a.equals("Carson")) {
	
	
	JOptionPane.showMessageDialog(null, "Correct. " );
}
		// 4. Otherwise say "wrong"
else {JOptionPane.showMessageDialog(null, "WRONG! " );}
		// 5. repeat the process for other words
		

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}



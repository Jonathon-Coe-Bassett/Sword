import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu {
	private static final long serialVersionUID=1L;
	static JFrame frame=new JFrame();
	 static int qNum=0;
	 static String[][] questions = fillArray();
	public static void doQuestionMenu()
		{
			int mainChoice;
			Object[] options = currentQuestion(qNum);
//			ImageIcon icon =  new ImageIcon("mn.jpg");
			mainChoice = JOptionPane.showOptionDialog(null, 
				questions[qNum][0],
				"QUESTION",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				null, options, 
				options[1]);
//				switch(mainChoice)
//				{
//				case 0:
//					{
////					doAddDeleteMenu();
//					break;
//					}
//				case 1:
//					{
//					//doChangeMenu();
//					break;
//					}
//				case 2:
//					{
//					//doSortMenu();
//					break;
//					}
//				}
			boolean isCorrect = (questions[qNum][mainChoice+1].equals(questions[qNum][4]));
			JOptionPane.showMessageDialog(frame, isCorrect);
			qNum++;
		}
	public static String[][] fillArray() {
		String [][] temp = {
				//Questions are stored as question, answer1, answer2, answer3, correct answer
				{"You are in the Occipital Lobe! What is likely to happen in the host brain?", "Loss of vision", "Hearing trouble", "The inability to enjoy chocolate chip cookies", "Loss of vision"},
				{"You are in the Temporal Lobe! What is likely to happen in the host brain?", "Olfactory issues", "Auditory issues", "Trouble with language processing and audio as well as loss of scent", "Trouble with language processing and audio as well as loss of scent"},
				{"You are in the Parietal Lobe! What is likely to happen in the host brain?", "Loss of personality, like Phinneas Gage", "Inability to feel touch and pain", "Issues formulating words", "Inability to feel touch and pain"},
				{"You are in the Somatosensory Cortex, in the Parietal lobe!! What is likely to happen in the host brain?", "Strange visual sensations", "Paralysis", "Trouble receiving sensory input from the body", "Trouble receiving sensory input from the body"},
				{"You are in the Frontal Lobe! What is likely to happen in the host brain?", "Trouble responding to danger", "Change in personality, like Phineas Gage", "The sudden urge to take Phychology with Mr. DeNezza", "Change in personality, like Phineas Gage"},
				{"You are in the Motor Cortex, in the Frontal Lobe! What is likely to happen in the host brain?", "The smell of toast", "Trouble with voluntary movement", "Loss of scent", "Trouble with voluntary movement"},
				{"You are in the Corpus Collosum! What is likely to happen in the host brain?", "Severe Depression", "Trouble with problem solving and communication within the brain", "Weird, long sentences that contribute nothing to the project", "Trouble with problem solving and communication within the brain"},
				{"You are in the Amygdala! What is likely to happen in the host brain?", "Issues with movement and balance", "Strange lights in the sky", "Change in perception of fear and emotion", "Change in perception of fear and emotion"},
				{"You are in the Cerebellum! What is likely to happen in the host brain?", "Strange, vivid dreams about your algebra teacher", "Difficulties with walking and mobility", "Alzheimers", "Difficulties with walking and mobility"},
				{"You are in the Hippocampus! What is likely to happen in the host brain?", "Your hippo friend, Tim, transfers to another school", "Trouble making and recalling memories", "Paralysis", "Trouble making and recalling memories"},
				{"You are in the Medulla! What is likely to happen in the host brain?", "Like, opening up your third eye, man", "Death caused by involuntary system shutdown", "Issues with sense of smell", "Death caused by involuntary system shutdown"},
				{"You have infected the whole Cerebral Cortex! What is likely to happen in the host brain?", "A neurodegenerative disease, such as Alzheimer's", "Issues with language processing", "A strong desire to flash your phychology class", "A neurodegenerative disease, such as Alzheimer's"},
				{"You have infected the whole Cerebrum! What is likely to happen in the host brain?", "Involuntary eye movement", "Stroke, dramatic brain injury, and death", "WORLD DOMINATION AHAHAHAHA!!!", "Stroke, dramatic brain injury, and death"}
		};
		return temp;
		
	}
	public static String[] currentQuestion(int n){
		String[] temp = {questions[n][1], questions[n][2], questions[n][3]};
		return temp;
	}
}

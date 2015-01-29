
public class GitGuy {
	
	private String reply;
	
	public GitGuy(String reply) {
		this.reply = reply;
	}
	
	public void talk() {
		System.out.println(reply);
	}

	public void setReply(String reply) {
		this.reply = reply;
	}
}

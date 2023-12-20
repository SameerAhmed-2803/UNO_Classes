public class ImGonnaBiteOffYourFaceException extends Exception {

	public  ImGonnaBiteOffYourFaceException(){
		super();
	}

	public ImGonnaBiteOffYourFaceException(String message){
		super(message);
	}

	public ImGonnaBiteOffYourFaceException(Exception e) {
		super(e);
	}

	public ImGonnaBiteOffYourFaceException(String message, Exception e) {
		super(message,e);

	}

}

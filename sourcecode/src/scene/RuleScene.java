package scene;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class RuleScene {
	
	
	public Button returnbtn = new Button("Return");
	
	private Text rule = new Text(100, 100, "Mục tiêu cần đạt được để giành chiến thắng: người thắng cuộc trong trò chơi này là người mà khi cuộc chơi kết thúc có tổng số dân quy đổi nhiều hơn."
			+ "\n\n"
			+ "Tùy theo luật chơi từng địa phương hoặc thỏa thuận giữa hai người chơi nhưng phổ biến là 1 quan được quy đổi bằng 10 dân hoặc 5 dân (cờ)."
			+ "\n\n"
			+ "Di chuyển quân: từng người chơi khi đến lượt của mình sẽ di chuyển dân theo phương án để có thể ăn được càng nhiều dân và quan hơn đối phương càng tốt."
			+ "\n\n"
			+ "Người thực hiện lượt đi đầu tiên thường được xác định bằng cách oẳn tù tì hay thỏa thuận."
			+ "\n\n"
			+ "Khi đến lượt, người chơi sẽ dùng tất cả số quân trong một ô có quân bất kỳ do người đó chọn trong số 5 ô vuông thuộc quyền kiểm soát của mình"
			+ "\n"
			+ "để lần lượt rải vào các ô, mỗi ô 1 quân, bắt đầu từ ô gần nhất và có thể rải ngược chiều xuôi chiều kim đồng hồ tùy ý."
			+ "\n\n"
			+ "Khi rải hết quân cuối cùng, tùy tình huống mà người chơi sẽ phải xử lý tiếp như sau:\n"
			+ "\n"
			+ "Nếu liền sau đó là một ô vuông có chứa quân thì tiếp tục dùng tất cả số quân đó để rải tiếp,theo chiều đã chọn.\n"
			+ "\n"
			+ "Nếu liền sau đó là một ô trống (không phân biệt ô quan hay ô dân) rồi đến một ô có chứa quân thì người chơi sẽ bị mất lượt số quân trong ô đó."
			+ "\n"
			+ "Số quân bị ăn sẽ được loại ra khỏi bàn chơi để người chơi tính điểm khi kết thúc."
			+ "\n"
			+ "Nếu liền sau ô có quân đã bị ăn lại là một ô trống rồi đến một ô có quân nữa thì người chơi có quyền ăn tiếp cả quân ở ô này..."
			+ "\nDo đó trong cuộc chơi có thể có phương án rải quân làm cho người chơi ăn hết toàn bộ số quân trên bàn chơi chỉ trong một lượt đi của mình."
			+ "\n Một ô có nhiều dân thường được trẻ em gọi là ô nhà giàu, rất nhiều dân thì gọi là giàu sụ."
			+ "\n Người chơi có thể bằng kinh nghiệm hoặc tính toán phương án nhằm nuôi ô nhà giàu rồi mới ăn để được nhiều điểm.\n"
			+ "Nếu liền sau đó là ô quan có chứa quân hoặc 2 ô trống trở lên hoặc sau khi vừa ăn thì người chơi bị mất lượt và quyền đi tiếp thuộc về đối phương.\n"
			+ "Trường hợp đến lượt đi nhưng cả năm ô vuông thuộc quyền kiểm soát của người chơi đều không có dân thì người đó sẽ phải"
			+ "\n dùng 5 dân đã ăn được của mình để đặt vào mỗi ô 1 dân để có thể thực hiện việc di chuyển quân."
			+ "\n Nếu người chơi không đủ 5 dân thì phải vay của đối phương và trả lại khi tính điểm.\n"
			+ "\n"
			+ "Cuộc chơi sẽ kết thúc khi toàn bộ dân và quan ở hai ô quan đã bị ăn hết."
			+ "\n Trường hợp hai ô quan đã bị ăn hết nhưng vẫn còn dân thì quân trong những hình vuông phía bên nào coi như thuộc về người chơi bên ấy;"
			+ "\n tình huống này được gọi là hết quan, tàn dân, thu quân, kéo về hay hết quan, tàn dân, thu quân, bán ruộng."
			+ "\n Ô quan có ít dân (có số dân nhỏ hơn 5 phổ biến được coi là ít) gọi là quan non và để cuộc chơi không bị kết thúc sớm cho tăng phần thú vị,"
			+ "\n luật chơi có thể quy định không được ăn quan non, nếu rơi vào tình huống đó sẽ bị mất lượt.");
	
	private Group root = new Group(returnbtn, rule);
	
	private Scene ruleScene;
	
	public Scene ruleScene() {
		
		returnbtn.setFont((Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20)));
		
		ruleScene = new Scene(root, 1000, 600, Color.WHEAT);
		return ruleScene;
		
	}

}

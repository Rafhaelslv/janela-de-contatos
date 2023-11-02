import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AppJanelaContato extends Application {
	public void start(Stage stage){
		Pane painel = new Pane();
		Scene scn = new Scene(painel, 640, 480);

		Label lblId = new Label("Id: " );
		lblId.setStyle("-fx-font: normal 32 serif; "
				+ "-fx-background-color: dark; "
				);
		lblId.relocate(50, 00);
		TextField txtId = new TextField();
		txtId.relocate(200, 00);

		Label lblNome = new Label("Nome: " );
		lblNome.setStyle("-fx-font: normal 32 serif; "
				+ "-fx-background-color: dark; "
				);
		lblNome.relocate(50, 50);
		TextField txtNome = new TextField();
		txtNome.relocate(200, 50);

		Label lblTelefone = new Label("Telefone: " );
		lblTelefone.setStyle("-fx-font: normal 32 serif; "
				+ "-fx-background-color: dark; "
				);
		lblTelefone.relocate(50, 100);
		TextField txtTelefone = new TextField();
		txtTelefone.relocate(200, 100);

		Button btnSalvar = new Button("Salvar");
		btnSalvar.relocate(400, 20);
		Button btnPesquisar = new Button("Pesquisar");
		btnPesquisar.relocate(400, 80);


		painel.getChildren().add(lblId);
		painel.getChildren().add(txtId);

		painel.getChildren().add(lblNome);
		painel.getChildren().add(txtNome);

		painel.getChildren().add(lblTelefone);
		painel.getChildren().add(txtTelefone);
		painel.getChildren().addAll(btnSalvar, btnPesquisar);

		stage.setScene(scn);
		stage.setTitle("Agenda de Contatos");
		stage.show();
	}
		public static void main(String[] args) {
			Application.launch(args);
		}
}

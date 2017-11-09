package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    public TextField textfield;
    public TableView<Czlowieczek> table;

    public static class Czlowieczek {

        protected String imie;
        protected Integer wiek;

        public Czlowieczek(String imie, Integer wiek) {
            this.imie = imie;
            this.wiek = wiek;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public Integer getWiek() {
            return wiek;
        }

        public void setWiek(Integer wiek) {
            this.wiek = wiek;
        }
    }

    public void handleClick(ActionEvent actionEvent) {
        table.getItems().add(new Czlowieczek(textfield.getText(), textfield.getText().length()));
    }

    public void initialize() {
        for (TableColumn<Czlowieczek, ?> column : table.getColumns()) {
            if ("napis".equals(column.getId())) {
                TableColumn<Czlowieczek, String> textColumn = (TableColumn<Czlowieczek, String>) column;
                textColumn.setCellValueFactory(new PropertyValueFactory<>("imie"));
            } else if ("dlugosc".equals(column.getId())) {
                TableColumn<Czlowieczek, Integer> lengthColumn = (TableColumn<Czlowieczek, Integer>) column;
                lengthColumn.setCellValueFactory(new PropertyValueFactory<>("wiek"));
            }
        }
        /*for (TableColumn<String, ?> column : table.getColumns()) {
            if ("napis".equals(column.getId())) {
                TableColumn<String, String> textColumn = (TableColumn<String, String>) column;
                textColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue()));
            } else if ("dlugosc".equals(column.getId())) {
                TableColumn<String, String> lengthColumn = (TableColumn<String, String>) column;
                lengthColumn.setCellValueFactory(param -> new SimpleStringProperty(String.valueOf(param.getValue().length())));
            }
        }*/
    }

}


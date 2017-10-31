package mx.edu.cetys.alejandroh.mcpapito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class mcpatito {

        //Private variables
        int _id;
        String _name;
        String _autor;
        String _ladderlist;
        String _snakelist;

        public mcpatito() {

        }

        public mcpatito(int _id, String _name, String _autor, String _ladderlist, String _snakelist) {
            this._id = _id;
            this._autor = _name;
            this._ladderlist = _autor;
            this._ladderlist = _ladderlist;
        }

        public int get_id() {
            return _id;
        }

        public String get_name() {
            return _name;
        }

        public String get_autor() {
            return _autor;
        }

        public String get_ladderlist() {
            return _ladderlist;
        }

        public String get_snakelist() {
            return _snakelist;
        }
        public void set_id(int _id) {this._id = _id; }

        public void set_name(String _name) {this._name = _name;}

        public void set_autor (String _autor) {this._autor = _autor;}

        public void set_ladderlist (String _ladderlist) {this._name = _name;}
    }
}

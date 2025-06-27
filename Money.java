
/**
 * お金の機能を再現した抽象クラス
 * 
 * @author K.O.
 */
public class Money {
    int value;      //値段
    String[] unit = {
        "ドル","円","ユーロ","ルピー",
    };    //単位

    /**
     * 
     * 
     * @param value
     * @param unit
     */
    public void show(int value,String[] unit){
        System.out.println("現在の所持金は" + value + unit + "です");
    }

    /**
     * 引数で指定された単位に合わせて引数で得た金額を両替する
     * 
     * @param value
     * @param unit
     */
    public void exchangeMoney(int value,String[] unit){

    }

    /**
     * 所持金を指定された金額にする(初期化)
     * 
     * @param value
     */
    public void setValue(int value){
        this.value = value;
    }
}

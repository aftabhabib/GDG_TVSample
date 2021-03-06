package sample.lyon.tv.myapplication.Detial;

import android.support.v17.leanback.widget.HeaderItem;
import android.support.v17.leanback.widget.ListRow;
import android.support.v17.leanback.widget.ObjectAdapter;

import sample.lyon.tv.myapplication.Detial.ui.CardRow;

/**
 * Created by i_hfuhsu on 2018/10/17.
 */

public class CardListRow extends ListRow {

    private CardRow mCardRow;

    public CardListRow(HeaderItem header, ObjectAdapter adapter, CardRow cardRow) {
        super(header, adapter);
        setCardRow(cardRow);
    }

    public CardRow getCardRow() {
        return mCardRow;
    }

    public void setCardRow(CardRow cardRow) {
        this.mCardRow = cardRow;
    }

}

/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package sample.lyon.tv.myapplication.Detial;

import android.content.Context;
import android.support.v17.leanback.widget.Presenter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sample.lyon.tv.myapplication.Detial.ui.DetailedCard;
import sample.lyon.tv.myapplication.R;
import sample.lyon.tv.myapplication.Tool.ResourceCache;
import sample.lyon.tv.myapplication.Tool.Utils;


public class DetailsDescriptionPresenter extends Presenter {

    private ResourceCache mResourceCache = new ResourceCache();
    private Context mContext;

    Button morebtn,nextbtn;

    public DetailsDescriptionPresenter(Context context) {
        mContext = context;
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.detail_view_content, null);
        return new ViewHolder(view);
    }

    @Override public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        TextView primaryText = mResourceCache.getViewById(viewHolder.view, R.id.primary_text);
        TextView sndText1 = mResourceCache.getViewById(viewHolder.view, R.id.secondary_text_first);
        TextView sndText2 = mResourceCache.getViewById(viewHolder.view, R.id.secondary_text_second);
        TextView extraText = mResourceCache.getViewById(viewHolder.view, R.id.extra_text);

        morebtn = mResourceCache.getViewById(viewHolder.view,R.id.button1);
        nextbtn = mResourceCache.getViewById(viewHolder.view,R.id.button2);
        morebtn.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    Utils.zoomOut(mContext,v);
                }else{
                    Utils.zoomIn(mContext,v);
                }
            }
        });

        nextbtn.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    Utils.zoomOut(mContext,v);
                }else{
                    Utils.zoomIn(mContext,v);
                }
            }
        });

        DetailedCard card = (DetailedCard) item;
        primaryText.setText(card.getTitle());
        sndText1.setText(card.getDescription());
        sndText2.setText(card.getYear() + "");
        extraText.setText(card.getText());
    }

    @Override public void onUnbindViewHolder(ViewHolder viewHolder) {
        // Nothing to do here.
    }
}

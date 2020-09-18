package com.lzi.elmo9af.listesModels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.lzi.elmo9af.Classes.Message;
import com.lzi.elmo9af.R;

import java.util.ArrayList;
import java.util.List;

public class MessageInbox_View extends BaseAdapter {

    protected Message currentMessage= null;

    List<Message> messages;
    LayoutInflater layoutInflater;
    public static List<String> selectedCodes = new ArrayList<String>();

    public MessageInbox_View(LayoutInflater layoutInflater, List<Message> messages) {
        this.messages = messages;
        this.layoutInflater = layoutInflater;
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Message getItem(int i) {
        return messages.get(i);
    }

    @Override
    public long getItemId(int i) {
        return messages.get(i).getMessage_id();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        currentMessage = getItem(i);
        View messageInboxView = layoutInflater.inflate(R.layout.message_inbox_item, null);
        ImageView senderImage = (ImageView) messageInboxView.findViewById(R.id.senderImage);
        TextView senderName = (TextView) messageInboxView.findViewById(R.id.senderName);

        TextView lastMessageContent = (TextView) messageInboxView.findViewById(R.id.lastMessageContent);
        TextView lastMessageTime = (TextView) messageInboxView.findViewById(R.id.lastMessageTime);

        return messageInboxView;
    }
}

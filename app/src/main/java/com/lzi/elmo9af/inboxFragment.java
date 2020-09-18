package com.lzi.elmo9af;

import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.lzi.elmo9af.Classes.User;
import com.lzi.elmo9af.listesModels.MessageInbox_View;

import java.util.ArrayList;
import java.util.List;

public class inboxFragment extends Fragment {

    ListView inboxMessages;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.inbox_fragment, container, false);
        chargeMessages();
        return view;
    }

    private void chargeMessages() {
        inboxMessages = (ListView) getActivity().findViewById(R.id.inbox_Messages);
        List<com.lzi.elmo9af.Classes.Message> messages = new ArrayList<com.lzi.elmo9af.Classes.Message>();

        for(int i=1;i<10;i++){
            com.lzi.elmo9af.Classes.Message message = new com.lzi.elmo9af.Classes.Message(i,new User(),new User(),"Message Message Message "+i,"12:"+(10+i));
            messages.add(message);
        }

        MessageInbox_View messageInbox_view = new MessageInbox_View(getLayoutInflater(),messages);
        inboxMessages.setAdapter(messageInbox_view);
    }

}

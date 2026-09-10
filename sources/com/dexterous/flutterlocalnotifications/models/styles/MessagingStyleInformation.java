package com.dexterous.flutterlocalnotifications.models.styles;

import androidx.annotation.Keep;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class MessagingStyleInformation extends DefaultStyleInformation {
    public String conversationTitle;
    public Boolean groupConversation;
    public ArrayList<MessageDetails> messages;
    public PersonDetails person;

    public MessagingStyleInformation(PersonDetails personDetails, String str, Boolean bool, ArrayList<MessageDetails> arrayList, Boolean bool2, Boolean bool3) {
        super(bool2, bool3);
        this.person = personDetails;
        this.conversationTitle = str;
        this.groupConversation = bool;
        this.messages = arrayList;
    }
}

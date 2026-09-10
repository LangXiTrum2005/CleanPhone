package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SessionLifecycleClient.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007*\u00010\b\u0000\u0018\u0000 42\u00020\u0001:\u00025\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient;", "", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lcom/google/firebase/sessions/trm;", "sessionLifecycleServiceBinder", "", "taiyuan", "(Lcom/google/firebase/sessions/trm;)V", "apical", "()V", "impromptu", "", "messageCode", "triweekly", "(I)V", "", "Landroid/os/Message;", "messages", "Lkotlinx/coroutines/monroe;", "kowloon", "(Ljava/util/List;)Lkotlinx/coroutines/monroe;", NotificationCompat.CATEGORY_MESSAGE, "arytenoidectomy", "(Landroid/os/Message;)V", "impassible", "", "cutely", "()Ljava/util/List;", "msgCode", "formularize", "(Ljava/util/List;I)Landroid/os/Message;", "attabal", "Lkotlin/coroutines/CoroutineContext;", "Landroid/os/Messenger;", "saneness", "Landroid/os/Messenger;", NotificationCompat.CATEGORY_SERVICE, "", "dern", "Z", "serviceBound", "Ljava/util/concurrent/LinkedBlockingDeque;", "wireman", "Ljava/util/concurrent/LinkedBlockingDeque;", "queuedMessages", "com/google/firebase/sessions/SessionLifecycleClient$saneness", "marial", "Lcom/google/firebase/sessions/SessionLifecycleClient$saneness;", "serviceConnection", "beachfront", "ClientUpdateHandler", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionLifecycleClient {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext backgroundDispatcher;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean serviceBound;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final saneness serviceConnection;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public Messenger service;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final LinkedBlockingDeque<Message> queuedMessages;

    /* JADX INFO: compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler;", "Landroid/os/Handler;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroid/os/Message;", NotificationCompat.CATEGORY_MESSAGE, "", "handleMessage", "(Landroid/os/Message;)V", "", JsonStorageKeyNames.SESSION_ID_KEY, "attabal", "(Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClientUpdateHandler extends Handler {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final CoroutineContext backgroundDispatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(CoroutineContext backgroundDispatcher) {
            super(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
            this.backgroundDispatcher = backgroundDispatcher;
        }

        public final void attabal(String sessionId) {
            kotlinx.coroutines.cutely.wireman(privatdozent.attabal(this.backgroundDispatcher), null, null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(sessionId, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String string;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what != 3) {
                msg.toString();
                super.handleMessage(msg);
                return;
            }
            Bundle data = msg.getData();
            if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                string = "";
            }
            attabal(string);
        }
    }

    /* JADX INFO: compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/google/firebase/sessions/SessionLifecycleClient$saneness", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "className", "Landroid/os/IBinder;", "serviceBinder", "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness implements ServiceConnection {
        public saneness() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName className, IBinder serviceBinder) {
            SessionLifecycleClient.this.queuedMessages.size();
            SessionLifecycleClient.this.service = new Messenger(serviceBinder);
            SessionLifecycleClient.this.serviceBound = true;
            SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
            sessionLifecycleClient.kowloon(sessionLifecycleClient.cutely());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName className) {
            SessionLifecycleClient.this.service = null;
            SessionLifecycleClient.this.serviceBound = false;
        }
    }

    public SessionLifecycleClient(CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.backgroundDispatcher = backgroundDispatcher;
        this.queuedMessages = new LinkedBlockingDeque<>(20);
        this.serviceConnection = new saneness();
    }

    public final void apical() {
        triweekly(1);
    }

    public final void arytenoidectomy(Message msg) {
        if (this.service == null) {
            impassible(msg);
            return;
        }
        try {
            int i = msg.what;
            Messenger messenger = this.service;
            if (messenger != null) {
                messenger.send(msg);
            }
        } catch (RemoteException unused) {
            int i2 = msg.what;
            impassible(msg);
        }
    }

    public final List<Message> cutely() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    public final Message formularize(List<Message> messages, int msgCode) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : messages) {
            if (((Message) obj2).what == msgCode) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public final void impassible(Message msg) {
        if (!this.queuedMessages.offer(msg)) {
            int i = msg.what;
        } else {
            int i2 = msg.what;
            this.queuedMessages.size();
        }
    }

    public final void impromptu() {
        triweekly(2);
    }

    public final monroe kowloon(List<Message> messages) {
        return kotlinx.coroutines.cutely.wireman(privatdozent.attabal(this.backgroundDispatcher), null, null, new SessionLifecycleClient$sendLifecycleEvents$1(this, messages, null), 3, null);
    }

    public final void taiyuan(trm sessionLifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.attabal(new Messenger(new ClientUpdateHandler(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void triweekly(int messageCode) {
        List<Message> listCutely = cutely();
        Message messageObtain = Message.obtain(null, messageCode, 0, 0);
        Intrinsics.checkNotNullExpressionValue(messageObtain, "obtain(null, messageCode, 0, 0)");
        listCutely.add(messageObtain);
        kowloon(listCutely);
    }
}

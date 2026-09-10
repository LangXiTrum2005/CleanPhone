package com.blankj.utilcode.util;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class MessengerUtils {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static ConcurrentHashMap<String, attabal> f17417attabal = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Map<String, Object> f17418saneness = new HashMap();

    public static class ServerService extends Service {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Handler f17419arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final ConcurrentHashMap<Integer, Messenger> f17420kowloon = new ConcurrentHashMap<>();

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final Messenger f17421monoploid;

        public class attabal extends Handler {
            public attabal() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    ServerService.this.f17420kowloon.put(Integer.valueOf(message.arg1), message.replyTo);
                    return;
                }
                if (i == 1) {
                    ServerService.this.f17420kowloon.remove(Integer.valueOf(message.arg1));
                } else if (i != 2) {
                    super.handleMessage(message);
                } else {
                    ServerService.this.marial(message);
                    ServerService.this.wireman(message);
                }
            }
        }

        public ServerService() {
            attabal attabalVar = new attabal();
            this.f17419arytenoidectomy = attabalVar;
            this.f17421monoploid = new Messenger(attabalVar);
        }

        public final void marial(Message message) {
            Message messageObtain = Message.obtain(message);
            for (Messenger messenger : this.f17420kowloon.values()) {
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain(messageObtain));
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
            messageObtain.recycle();
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return this.f17421monoploid.getBinder();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            Bundle extras;
            if (Build.VERSION.SDK_INT >= 26) {
                startForeground(1, rotuma.formularize(triweekly.attabal.f17497saneness, null));
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                Message messageObtain = Message.obtain(this.f17419arytenoidectomy, 2);
                messageObtain.replyTo = this.f17421monoploid;
                messageObtain.setData(extras);
                marial(messageObtain);
                wireman(messageObtain);
            }
            return 2;
        }

        public final void wireman(Message message) {
            String string;
            attabal attabalVar;
            Bundle data = message.getData();
            if (data == null || (string = data.getString("MESSENGER_UTILS")) == null || (attabalVar = (attabal) MessengerUtils.f17417attabal.get(string)) == null) {
                return;
            }
            attabalVar.attabal(data);
        }
    }

    public interface attabal {
        void attabal(Bundle bundle);
    }
}

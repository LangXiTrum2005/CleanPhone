package com.codejoy.boom.clap.fcm;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CloudMessagingService.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/codejoy/boom/clap/fcm/CloudMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "newToken", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CloudMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
        String messageId = remoteMessage.getMessageId();
        if (messageId == null) {
            messageId = "";
        }
        dernVar.saneness("SmartPush", "收到 FCM 消息：messageId=" + messageId + "，dataKeys=" + remoteMessage.getData().keySet());
        Map<String, String> data = remoteMessage.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        if (!data.isEmpty()) {
            FCMExtraActionHelper fCMExtraActionHelper = FCMExtraActionHelper.f18216attabal;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            if (fCMExtraActionHelper.taiyuan(remoteMessage, applicationContext)) {
                dernVar.saneness("SmartPush", "data 消息已消费");
                return;
            }
        }
        dernVar.saneness("SmartPush", "尝试使用 notification payload 回退展示");
        FCMExtraActionHelper.f18216attabal.apical(remoteMessage, this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String newToken) {
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        super.onNewToken(newToken);
        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "FCM token 已更新，开始重新同步");
        FcmActionHelper.f18220attabal.apical(newToken);
    }
}

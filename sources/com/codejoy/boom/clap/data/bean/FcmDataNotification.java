package com.codejoy.boom.clap.data.bean;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import picketboat.dern;

/* JADX INFO: compiled from: FcmDataNotification.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0001EB\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0092\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010 J\u0010\u00100\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b0\u0010\u0019J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010 R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\bA\u0010 R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bB\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bC\u0010 ¨\u0006F"}, d2 = {"Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;", "Landroid/os/Parcelable;", "", "title", "body", "imageUrl", "pushId", "pushType", "pushWay", "pushBatch", "condition", "pushTrace", "excludeLanguages", "notificationUiType", "messageId", "entrance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "", "putInto", "(Landroid/content/Intent;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;", "toString", "hashCode", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getBody", "getImageUrl", "getPushId", "getPushType", "getPushWay", "getPushBatch", "getCondition", "getPushTrace", "getExcludeLanguages", "getNotificationUiType", "getMessageId", "getEntrance", "Companion", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FcmDataNotification implements Parcelable {
    public static final int $stable = 0;
    private static final String EXTRA_PAYLOAD = "extra_fcm_data_notification";
    private final String body;
    private final String condition;
    private final String entrance;
    private final String excludeLanguages;
    private final String imageUrl;
    private final String messageId;
    private final String notificationUiType;
    private final String pushBatch;
    private final String pushId;
    private final String pushTrace;
    private final String pushType;
    private final String pushWay;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FcmDataNotification> CREATOR = new saneness();

    /* JADX INFO: renamed from: com.codejoy.boom.clap.data.bean.FcmDataNotification$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FcmDataNotification.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/codejoy/boom/clap/data/bean/FcmDataNotification$attabal;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;", "attabal", "(Landroid/content/Intent;)Lcom/codejoy/boom/clap/data/bean/FcmDataNotification;", "", "EXTRA_PAYLOAD", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FcmDataNotification attabal(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return (FcmDataNotification) dern.attabal(intent, FcmDataNotification.EXTRA_PAYLOAD, FcmDataNotification.class);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: FcmDataNotification.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class saneness implements Parcelable.Creator<FcmDataNotification> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public final FcmDataNotification createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FcmDataNotification(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public final FcmDataNotification[] newArray(int i) {
            return new FcmDataNotification[i];
        }
    }

    public FcmDataNotification() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ FcmDataNotification copy$default(FcmDataNotification fcmDataNotification, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fcmDataNotification.title;
        }
        return fcmDataNotification.copy(str, (i & 2) != 0 ? fcmDataNotification.body : str2, (i & 4) != 0 ? fcmDataNotification.imageUrl : str3, (i & 8) != 0 ? fcmDataNotification.pushId : str4, (i & 16) != 0 ? fcmDataNotification.pushType : str5, (i & 32) != 0 ? fcmDataNotification.pushWay : str6, (i & 64) != 0 ? fcmDataNotification.pushBatch : str7, (i & 128) != 0 ? fcmDataNotification.condition : str8, (i & 256) != 0 ? fcmDataNotification.pushTrace : str9, (i & 512) != 0 ? fcmDataNotification.excludeLanguages : str10, (i & 1024) != 0 ? fcmDataNotification.notificationUiType : str11, (i & 2048) != 0 ? fcmDataNotification.messageId : str12, (i & 4096) != 0 ? fcmDataNotification.entrance : str13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExcludeLanguages() {
        return this.excludeLanguages;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNotificationUiType() {
        return this.notificationUiType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getEntrance() {
        return this.entrance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPushId() {
        return this.pushId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPushType() {
        return this.pushType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPushWay() {
        return this.pushWay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPushBatch() {
        return this.pushBatch;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCondition() {
        return this.condition;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPushTrace() {
        return this.pushTrace;
    }

    public final FcmDataNotification copy(String title, String body, String imageUrl, String pushId, String pushType, String pushWay, String pushBatch, String condition, String pushTrace, String excludeLanguages, String notificationUiType, String messageId, String entrance) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Intrinsics.checkNotNullParameter(pushType, "pushType");
        Intrinsics.checkNotNullParameter(pushWay, "pushWay");
        Intrinsics.checkNotNullParameter(pushBatch, "pushBatch");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(pushTrace, "pushTrace");
        Intrinsics.checkNotNullParameter(excludeLanguages, "excludeLanguages");
        Intrinsics.checkNotNullParameter(notificationUiType, "notificationUiType");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(entrance, "entrance");
        return new FcmDataNotification(title, body, imageUrl, pushId, pushType, pushWay, pushBatch, condition, pushTrace, excludeLanguages, notificationUiType, messageId, entrance);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FcmDataNotification)) {
            return false;
        }
        FcmDataNotification fcmDataNotification = (FcmDataNotification) other;
        return Intrinsics.wireman(this.title, fcmDataNotification.title) && Intrinsics.wireman(this.body, fcmDataNotification.body) && Intrinsics.wireman(this.imageUrl, fcmDataNotification.imageUrl) && Intrinsics.wireman(this.pushId, fcmDataNotification.pushId) && Intrinsics.wireman(this.pushType, fcmDataNotification.pushType) && Intrinsics.wireman(this.pushWay, fcmDataNotification.pushWay) && Intrinsics.wireman(this.pushBatch, fcmDataNotification.pushBatch) && Intrinsics.wireman(this.condition, fcmDataNotification.condition) && Intrinsics.wireman(this.pushTrace, fcmDataNotification.pushTrace) && Intrinsics.wireman(this.excludeLanguages, fcmDataNotification.excludeLanguages) && Intrinsics.wireman(this.notificationUiType, fcmDataNotification.notificationUiType) && Intrinsics.wireman(this.messageId, fcmDataNotification.messageId) && Intrinsics.wireman(this.entrance, fcmDataNotification.entrance);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCondition() {
        return this.condition;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final String getExcludeLanguages() {
        return this.excludeLanguages;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getNotificationUiType() {
        return this.notificationUiType;
    }

    public final String getPushBatch() {
        return this.pushBatch;
    }

    public final String getPushId() {
        return this.pushId;
    }

    public final String getPushTrace() {
        return this.pushTrace;
    }

    public final String getPushType() {
        return this.pushType;
    }

    public final String getPushWay() {
        return this.pushWay;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.pushId.hashCode()) * 31) + this.pushType.hashCode()) * 31) + this.pushWay.hashCode()) * 31) + this.pushBatch.hashCode()) * 31) + this.condition.hashCode()) * 31) + this.pushTrace.hashCode()) * 31) + this.excludeLanguages.hashCode()) * 31) + this.notificationUiType.hashCode()) * 31) + this.messageId.hashCode()) * 31) + this.entrance.hashCode();
    }

    public final void putInto(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.putExtra(EXTRA_PAYLOAD, this);
    }

    public String toString() {
        return "FcmDataNotification(title=" + this.title + ", body=" + this.body + ", imageUrl=" + this.imageUrl + ", pushId=" + this.pushId + ", pushType=" + this.pushType + ", pushWay=" + this.pushWay + ", pushBatch=" + this.pushBatch + ", condition=" + this.condition + ", pushTrace=" + this.pushTrace + ", excludeLanguages=" + this.excludeLanguages + ", notificationUiType=" + this.notificationUiType + ", messageId=" + this.messageId + ", entrance=" + this.entrance + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.body);
        dest.writeString(this.imageUrl);
        dest.writeString(this.pushId);
        dest.writeString(this.pushType);
        dest.writeString(this.pushWay);
        dest.writeString(this.pushBatch);
        dest.writeString(this.condition);
        dest.writeString(this.pushTrace);
        dest.writeString(this.excludeLanguages);
        dest.writeString(this.notificationUiType);
        dest.writeString(this.messageId);
        dest.writeString(this.entrance);
    }

    public FcmDataNotification(String title, String body, String imageUrl, String pushId, String pushType, String pushWay, String pushBatch, String condition, String pushTrace, String excludeLanguages, String notificationUiType, String messageId, String entrance) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Intrinsics.checkNotNullParameter(pushType, "pushType");
        Intrinsics.checkNotNullParameter(pushWay, "pushWay");
        Intrinsics.checkNotNullParameter(pushBatch, "pushBatch");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(pushTrace, "pushTrace");
        Intrinsics.checkNotNullParameter(excludeLanguages, "excludeLanguages");
        Intrinsics.checkNotNullParameter(notificationUiType, "notificationUiType");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(entrance, "entrance");
        this.title = title;
        this.body = body;
        this.imageUrl = imageUrl;
        this.pushId = pushId;
        this.pushType = pushType;
        this.pushWay = pushWay;
        this.pushBatch = pushBatch;
        this.condition = condition;
        this.pushTrace = pushTrace;
        this.excludeLanguages = excludeLanguages;
        this.notificationUiType = notificationUiType;
        this.messageId = messageId;
        this.entrance = entrance;
    }

    public /* synthetic */ FcmDataNotification(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13);
    }
}

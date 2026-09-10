package com.zg.adlib.bean;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/zg/adlib/bean/LanguageBean;", "", "title", "", "languageId", "resId", "", "isCheck", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getTitle", "()Ljava/lang/String;", "getLanguageId", "getResId", "()I", "setResId", "(I)V", "()Z", "setCheck", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LanguageBean {
    private boolean isCheck;
    private final String languageId;
    private int resId;
    private final String title;

    public LanguageBean(String title, String languageId, int i2, boolean z2) {
        Intrinsics.f(title, "title");
        Intrinsics.f(languageId, "languageId");
        this.title = title;
        this.languageId = languageId;
        this.resId = i2;
        this.isCheck = z2;
    }

    public static /* synthetic */ LanguageBean copy$default(LanguageBean languageBean, String str, String str2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = languageBean.title;
        }
        if ((i3 & 2) != 0) {
            str2 = languageBean.languageId;
        }
        if ((i3 & 4) != 0) {
            i2 = languageBean.resId;
        }
        if ((i3 & 8) != 0) {
            z2 = languageBean.isCheck;
        }
        return languageBean.copy(str, str2, i2, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLanguageId() {
        return this.languageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsCheck() {
        return this.isCheck;
    }

    public final LanguageBean copy(String title, String languageId, int resId, boolean isCheck) {
        Intrinsics.f(title, "title");
        Intrinsics.f(languageId, "languageId");
        return new LanguageBean(title, languageId, resId, isCheck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageBean)) {
            return false;
        }
        LanguageBean languageBean = (LanguageBean) other;
        return Intrinsics.a(this.title, languageBean.title) && Intrinsics.a(this.languageId, languageBean.languageId) && this.resId == languageBean.resId && this.isCheck == languageBean.isCheck;
    }

    public final String getLanguageId() {
        return this.languageId;
    }

    public final int getResId() {
        return this.resId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCheck) + a.a(this.resId, androidx.datastore.preferences.protobuf.a.b(this.languageId, this.title.hashCode() * 31, 31), 31);
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final void setCheck(boolean z2) {
        this.isCheck = z2;
    }

    public final void setResId(int i2) {
        this.resId = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LanguageBean(title=");
        sb.append(this.title);
        sb.append(", languageId=");
        sb.append(this.languageId);
        sb.append(", resId=");
        sb.append(this.resId);
        sb.append(", isCheck=");
        return a.r(sb, this.isCheck, ')');
    }

    public /* synthetic */ LanguageBean(String str, String str2, int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i2, (i3 & 8) != 0 ? false : z2);
    }
}

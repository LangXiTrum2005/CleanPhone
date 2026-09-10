package dabble;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dabble.attabal, reason: from toString */
/* JADX INFO: compiled from: LanguageBean.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ldabble/attabal;", "", "", "languageName", "languageCode", "", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/String;", "dern", "setLanguageName", "(Ljava/lang/String;)V", "saneness", "setLanguageCode", "I", "setIcon", "(I)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LanguageBean {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public String languageName;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public int icon;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public String languageCode;

    public LanguageBean() {
        this(null, null, 0, 7, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final String getLanguageName() {
        return this.languageName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageBean)) {
            return false;
        }
        LanguageBean languageBean = (LanguageBean) other;
        return Intrinsics.wireman(this.languageName, languageBean.languageName) && Intrinsics.wireman(this.languageCode, languageBean.languageCode) && this.icon == languageBean.icon;
    }

    public int hashCode() {
        return (((this.languageName.hashCode() * 31) + this.languageCode.hashCode()) * 31) + Integer.hashCode(this.icon);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    public String toString() {
        return "LanguageBean(languageName=" + this.languageName + ", languageCode=" + this.languageCode + ", icon=" + this.icon + ")";
    }

    public LanguageBean(String languageName, String languageCode, int i) {
        Intrinsics.checkNotNullParameter(languageName, "languageName");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        this.languageName = languageName;
        this.languageCode = languageCode;
        this.icon = i;
    }

    public /* synthetic */ LanguageBean(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}

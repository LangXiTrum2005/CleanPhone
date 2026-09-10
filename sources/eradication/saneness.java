package eradication;

import android.app.Application;
import android.util.Base64;
import bunt.wireman;
import com.blankj.utilcode.util.adultoid;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: YoloEncryptHttpUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00042\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Leradication/saneness;", "Leradication/attabal;", "<init>", "()V", "", "impromptu", "()Ljava/lang/String;", "iv", "data", "", "marial", "(Ljava/lang/String;Ljava/lang/String;)[B", "wireman", "(Ljava/lang/String;[B)Ljava/lang/String;", "Ljava/lang/Class;", "cls", "saneness", "(Ljava/lang/Class;)Ljava/lang/String;", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness extends attabal {
    @Override // eradication.attabal
    public String impromptu() {
        return revolt.attabal.f36720attabal.dern().getHeaderXToken();
    }

    @Override // eradication.attabal
    public byte[] marial(String iv, String data) {
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(data, "data");
        petrol.attabal attabalVar = petrol.attabal.f35179attabal;
        Application applicationAttabal = adultoid.attabal();
        Intrinsics.checkNotNullExpressionValue(applicationAttabal, "getApp()");
        return attabalVar.cutely(applicationAttabal, iv, data);
    }

    @Override // shapoo.saneness
    public String saneness(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "cls");
        return wireman.f15189attabal.attabal();
    }

    @Override // eradication.attabal
    public String wireman(String iv, byte[] data) {
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(data, "data");
        petrol.attabal attabalVar = petrol.attabal.f35179attabal;
        Application applicationAttabal = adultoid.attabal();
        Intrinsics.checkNotNullExpressionValue(applicationAttabal, "getApp()");
        byte[] bArrDecode = Base64.decode(data, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(data, Base64.DEFAULT)");
        return attabalVar.impromptu(applicationAttabal, iv, bArrDecode);
    }
}

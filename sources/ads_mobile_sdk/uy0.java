package ads_mobile_sdk;

import android.net.Uri;
import com.google.gson.JsonObject;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class uy0 extends ContinuationImpl {
    public wz0 a;
    public String b;
    public JsonObject c;
    public Uri.Builder d;
    public Uri.Builder e;
    public String f;
    public Uri.Builder g;
    public /* synthetic */ Object h;
    public final /* synthetic */ wz0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy0(wz0 wz0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.i = wz0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a((String) null, (String) null, (JsonObject) null, this);
    }
}

package ads_mobile_sdk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class bn1 extends Lambda implements Function0 {
    public final /* synthetic */ spartacist a;
    public final /* synthetic */ String b;
    public final /* synthetic */ double c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn1(spartacist spartacistVar, String str, double d, int i, int i2) {
        super(0);
        this.a = spartacistVar;
        this.b = str;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), (Bitmap) ((tn0) this.a).b);
        Uri uri = Uri.parse(this.b);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return new g61(bitmapDrawable, uri, this.c, this.d, this.e);
    }
}

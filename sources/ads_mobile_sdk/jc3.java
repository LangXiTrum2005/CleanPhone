package ads_mobile_sdk;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jc3 implements Supplier {
    public final /* synthetic */ int a;
    public static final /* synthetic */ jc3 c = new jc3(1);
    public static final /* synthetic */ jc3 b = new jc3(0);

    public /* synthetic */ jc3(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a != 0 ? zc3.a((Object) null) : new mc3();
    }
}

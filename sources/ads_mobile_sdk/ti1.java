package ads_mobile_sdk;

import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bostonian;
import saneness.idolatry;

/* JADX INFO: loaded from: classes.dex */
public abstract class ti1 implements bostonian {
    public final bostonian a;
    public final bostonian b;
    public final Function1 c;

    public ti1(bostonian multiFormatAdRendererMap, bostonian rendererMap, Function1 adWrapper) {
        Intrinsics.checkNotNullParameter(multiFormatAdRendererMap, "multiFormatAdRendererMap");
        Intrinsics.checkNotNullParameter(rendererMap, "rendererMap");
        Intrinsics.checkNotNullParameter(adWrapper, "adWrapper");
        this.a = multiFormatAdRendererMap;
        this.b = rendererMap;
        this.c = adWrapper;
    }

    @Override // saneness.bostonian
    public final idolatry a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        idolatry idolatryVarA = this.b.a(name);
        if (idolatryVarA != null) {
            return new si1(idolatryVarA, this);
        }
        if (this.a.a(name) != null) {
            return this.a.a(name);
        }
        return null;
    }
}

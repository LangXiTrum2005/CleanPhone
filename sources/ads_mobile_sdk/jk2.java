package ads_mobile_sdk;

import com.google.common.base.formularize;
import com.google.common.collect.ImmutableList;
import saneness.extensimeter;

/* JADX INFO: loaded from: classes.dex */
public final class jk2 {
    public static final jk2 d;
    public final boolean a;
    public final ImmutableList b;
    public final ImmutableList c;

    static {
        ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
        ImmutableList.attabal attabalVarBuilder2 = ImmutableList.builder();
        formularize.adultoid(true, "A SourcePolicy can only set internal() or external() once.");
        Boolean bool = Boolean.FALSE;
        formularize.kowloon(bool, "Must call internal() or external() when building a SourcePolicy.");
        d = new jk2(false, attabalVarBuilder.impassible(), attabalVarBuilder2.impassible());
        ImmutableList.attabal attabalVarBuilder3 = ImmutableList.builder();
        ImmutableList.attabal attabalVarBuilder4 = ImmutableList.builder();
        formularize.adultoid(true, "A SourcePolicy can only set internal() or external() once.");
        extensimeter extensimeterVar = new extensimeter();
        formularize.kowloon(bool, "Must call internal() or external() before appending rules.");
        attabalVarBuilder3.attabal(extensimeterVar);
        formularize.kowloon(bool, "Must call internal() or external() when building a SourcePolicy.");
        attabalVarBuilder3.impassible();
        attabalVarBuilder4.impassible();
        ImmutableList.attabal attabalVarBuilder5 = ImmutableList.builder();
        ImmutableList.attabal attabalVarBuilder6 = ImmutableList.builder();
        formularize.adultoid(true, "A SourcePolicy can only set internal() or external() once.");
        formularize.kowloon(Boolean.TRUE, "Must call internal() or external() when building a SourcePolicy.");
        attabalVarBuilder5.impassible();
        attabalVarBuilder6.impassible();
    }

    public jk2(boolean z, ImmutableList immutableList, ImmutableList immutableList2) {
        this.a = z;
        this.b = immutableList;
        this.c = immutableList2;
    }
}

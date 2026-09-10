package kotlin.reflect.jvm.internal.impl.util;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final class OperatorNameConventions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Name f44621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Name f44622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Name f44623c;
    public static final Name d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Name f44624e;
    public static final Name f;
    public static final Name g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Name f44625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Name f44626i;
    public static final Name j;
    public static final Name k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Name f44627l;
    public static final Regex m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Name f44628n;
    public static final Name o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Name f44629p;
    public static final Name q;
    public static final Set r;
    public static final Set s;
    public static final Set t;

    static {
        Name nameG = Name.g("getValue");
        f44621a = nameG;
        Name nameG2 = Name.g("setValue");
        f44622b = nameG2;
        Name nameG3 = Name.g("provideDelegate");
        f44623c = nameG3;
        Name nameG4 = Name.g("equals");
        d = nameG4;
        Name.g("hashCode");
        Name nameG5 = Name.g("compareTo");
        f44624e = nameG5;
        Name nameG6 = Name.g("contains");
        f = nameG6;
        g = Name.g("invoke");
        f44625h = Name.g("iterator");
        f44626i = Name.g("get");
        j = Name.g("set");
        k = Name.g("next");
        f44627l = Name.g("hasNext");
        Name.g("toString");
        m = new Regex("component\\d+");
        Name nameG7 = Name.g("and");
        Name nameG8 = Name.g("or");
        Name nameG9 = Name.g("xor");
        Name nameG10 = Name.g("inv");
        Name nameG11 = Name.g("shl");
        Name nameG12 = Name.g("shr");
        Name nameG13 = Name.g("ushr");
        Name nameG14 = Name.g("inc");
        f44628n = nameG14;
        Name nameG15 = Name.g("dec");
        o = nameG15;
        Name nameG16 = Name.g("plus");
        Name nameG17 = Name.g("minus");
        Name nameG18 = Name.g("not");
        Name nameG19 = Name.g("unaryMinus");
        Name nameG20 = Name.g("unaryPlus");
        Name nameG21 = Name.g("times");
        Name nameG22 = Name.g(TtmlNode.TAG_DIV);
        Name nameG23 = Name.g("mod");
        Name nameG24 = Name.g("rem");
        Name nameG25 = Name.g("rangeTo");
        f44629p = nameG25;
        Name nameG26 = Name.g("rangeUntil");
        q = nameG26;
        Name nameG27 = Name.g("timesAssign");
        Name nameG28 = Name.g("divAssign");
        Name nameG29 = Name.g("modAssign");
        Name nameG30 = Name.g("remAssign");
        Name nameG31 = Name.g("plusAssign");
        Name nameG32 = Name.g("minusAssign");
        ArraysKt.O(new Name[]{nameG14, nameG15, nameG20, nameG19, nameG18, nameG10});
        r = ArraysKt.O(new Name[]{nameG20, nameG19, nameG18, nameG10});
        Set setO = ArraysKt.O(new Name[]{nameG21, nameG16, nameG17, nameG22, nameG23, nameG24, nameG25, nameG26});
        s = setO;
        SetsKt.f(SetsKt.f(setO, ArraysKt.O(new Name[]{nameG7, nameG8, nameG9, nameG10, nameG11, nameG12, nameG13})), ArraysKt.O(new Name[]{nameG4, nameG6, nameG5}));
        t = ArraysKt.O(new Name[]{nameG27, nameG28, nameG29, nameG30, nameG31, nameG32});
        ArraysKt.O(new Name[]{nameG, nameG2, nameG3});
    }
}

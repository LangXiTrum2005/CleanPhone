package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final class OperatorChecks extends AbstractModifierChecks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f44620a;

    static {
        Name name = OperatorNameConventions.f44626i;
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.f44615b;
        Checks checks = new Checks(name, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(1)});
        Checks checks2 = new Checks(OperatorNameConventions.j, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(2)}, OperatorChecks$checks$1.X);
        Name name2 = OperatorNameConventions.f44621a;
        NoDefaultAndVarargsCheck noDefaultAndVarargsCheck = NoDefaultAndVarargsCheck.f44617a;
        ValueParameterCountCheck.AtLeast atLeast = new ValueParameterCountCheck.AtLeast(2);
        IsKPropertyCheck isKPropertyCheck = IsKPropertyCheck.f44612a;
        Checks checks3 = new Checks(name2, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, atLeast, isKPropertyCheck});
        Checks checks4 = new Checks(OperatorNameConventions.f44622b, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.AtLeast(3), isKPropertyCheck});
        Checks checks5 = new Checks(OperatorNameConventions.f44623c, new Check[]{memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.Equals(), isKPropertyCheck});
        Checks checks6 = new Checks(OperatorNameConventions.g, new Check[]{memberOrExtension});
        Name name3 = OperatorNameConventions.f;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.f44641b;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.f44632c;
        Checks checks7 = new Checks(name3, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck, returnsBoolean});
        Name name4 = OperatorNameConventions.f44625h;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.f44640b;
        Checks checks8 = new Checks(name4, new Check[]{memberOrExtension, noValueParameters});
        Checks checks9 = new Checks(OperatorNameConventions.k, new Check[]{memberOrExtension, noValueParameters});
        Checks checks10 = new Checks(OperatorNameConventions.f44627l, new Check[]{memberOrExtension, noValueParameters, returnsBoolean});
        Checks checks11 = new Checks(OperatorNameConventions.f44629p, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck});
        Checks checks12 = new Checks(OperatorNameConventions.q, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck});
        Checks checks13 = new Checks(OperatorNameConventions.d, new Check[]{MemberKindCheck.Member.f44614b}, OperatorChecks$checks$2.X);
        Checks checks14 = new Checks(OperatorNameConventions.f44624e, new Check[]{memberOrExtension, ReturnsCheck.ReturnsInt.f44633c, singleValueParameter, noDefaultAndVarargsCheck});
        Checks checks15 = new Checks(OperatorNameConventions.s, new Check[]{memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck});
        Checks checks16 = new Checks(OperatorNameConventions.r, new Check[]{memberOrExtension, noValueParameters});
        Checks checks17 = new Checks(CollectionsKt.I(OperatorNameConventions.f44628n, OperatorNameConventions.o), new Check[]{memberOrExtension}, OperatorChecks$checks$3.X);
        Checks checks18 = new Checks(OperatorNameConventions.t, new Check[]{memberOrExtension, ReturnsCheck.ReturnsUnit.f44634c, singleValueParameter, noDefaultAndVarargsCheck});
        Regex regex = OperatorNameConventions.m;
        Checks.AnonymousClass3 anonymousClass3 = Checks.AnonymousClass3.X;
        Intrinsics.f(regex, "regex");
        f44620a = CollectionsKt.I(checks, checks2, checks3, checks4, checks5, checks6, checks7, checks8, checks9, checks10, checks11, checks12, checks13, checks14, checks15, checks16, checks17, checks18, new Checks(null, regex, null, anonymousClass3, (Check[]) Arrays.copyOf(new Check[]{memberOrExtension, noValueParameters}, 2)));
    }
}

package ads_mobile_sdk;

import com.ironsource.X3;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.amphitheatre;
import saneness.hemolysin;
import saneness.laky;

/* JADX INFO: loaded from: classes.dex */
public final class j20 implements hemolysin {
    public static final Pattern c = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    public static final Pattern d = Pattern.compile("^[0-9]*(,[0-9]*)*$");
    public final amphitheatre a;
    public final jk0 b;

    public j20(jk0 flags, amphitheatre clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = clock;
        this.b = flags;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("action");
        if (str != null) {
            int iHashCode = str.hashCode();
            Object objA = null;
            if (iHashCode != -85337091) {
                if (iHashCode != 3559837) {
                    if (iHashCode == 96965648 && str.equals("extra")) {
                        String str2 = (String) map.get("name");
                        String str3 = (String) map.get("value");
                        if (str2 == null || str2.length() == 0) {
                            y13.a("No name provided on CSI extra gmsg", null, 6);
                            objA = Unit.f29295attabal;
                        } else {
                            jk0 jk0Var = this.b;
                            jk0Var.getClass();
                            Intrinsics.checkNotNullParameter("gads:csi_gmsg_parameter_validation:enabled", X3.i.W);
                            if (((Boolean) jk0Var.a("gads:csi_gmsg_parameter_validation:enabled", Boolean.TRUE, zk.b)).booleanValue() && !c.matcher(str2).matches()) {
                                y13.a("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.", null, 6);
                                objA = Unit.f29295attabal;
                            } else if (str3 == null || str3.length() == 0) {
                                y13.a("No value provided on CSI extra gmsg", null, 6);
                                objA = Unit.f29295attabal;
                            } else {
                                u20 u20Var = gq0Var.d;
                                if (u20Var != null && (objA = u20Var.a(str2, str3, true, dernVar)) != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                    objA = Unit.f29295attabal;
                                }
                            }
                        }
                        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
                    }
                } else if (str.equals("tick")) {
                    String str4 = (String) map.get("label");
                    String str5 = (String) map.get("start_label");
                    if (str5 == null) {
                        str5 = "native:view_load";
                    }
                    String str6 = (String) map.get("timestamp");
                    if (str4 == null || str4.length() == 0) {
                        y13.a("No label provided on CSI tick gmsg", null, 6);
                        objA = Unit.f29295attabal;
                    } else {
                        jk0 jk0Var2 = this.b;
                        jk0Var2.getClass();
                        Intrinsics.checkNotNullParameter("gads:csi_gmsg_parameter_validation:enabled", X3.i.W);
                        Boolean bool = Boolean.TRUE;
                        jk jkVar = zk.b;
                        if (!((Boolean) jk0Var2.a("gads:csi_gmsg_parameter_validation:enabled", bool, jkVar)).booleanValue() || c.matcher(str4).matches()) {
                            jk0 jk0Var3 = this.b;
                            jk0Var3.getClass();
                            Intrinsics.checkNotNullParameter("gads:csi_gmsg_parameter_validation:enabled", X3.i.W);
                            if (((Boolean) jk0Var3.a("gads:csi_gmsg_parameter_validation:enabled", bool, jkVar)).booleanValue() && !c.matcher(str5).matches()) {
                                y13.a("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.", null, 6);
                                objA = Unit.f29295attabal;
                            } else if (str6 == null || str6.length() == 0) {
                                y13.a("No timestamp provided on CSI tick gmsg", null, 6);
                                objA = Unit.f29295attabal;
                            } else {
                                try {
                                    laky lakyVar = ip0.f;
                                    long jAttabal = laky.attabal(this.a, Long.parseLong(str6));
                                    u20 u20Var2 = gq0Var.d;
                                    if (u20Var2 != null && (objA = u20Var2.a(str4, str5, jAttabal, dernVar)) != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                                        objA = Unit.f29295attabal;
                                    }
                                } catch (NumberFormatException e) {
                                    y13.a("Malformed timestamp provided on CSI tick gmsg", e, 4);
                                    objA = Unit.f29295attabal;
                                }
                            }
                        } else {
                            y13.a("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.", null, 6);
                            objA = Unit.f29295attabal;
                        }
                    }
                    return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
                }
            } else if (str.equals("experiment")) {
                String str7 = (String) map.get("value");
                if (str7 == null || str7.length() == 0) {
                    y13.a("No value provided on CSI experiment gmsg", null, 6);
                    objA = Unit.f29295attabal;
                } else {
                    jk0 jk0Var4 = this.b;
                    jk0Var4.getClass();
                    Intrinsics.checkNotNullParameter("gads:csi_gmsg_parameter_validation:enabled", X3.i.W);
                    if (!((Boolean) jk0Var4.a("gads:csi_gmsg_parameter_validation:enabled", Boolean.TRUE, zk.b)).booleanValue() || d.matcher(str7).matches()) {
                        List listSplit$default = StringsKt.split$default(str7, new String[]{","}, false, 0, 6, null);
                        u20 u20Var3 = gq0Var.d;
                        if (u20Var3 != null && (objA = u20Var3.a("e", listSplit$default, dernVar)) != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                            objA = Unit.f29295attabal;
                        }
                    } else {
                        y13.a("Invalid value given for CSI experiment. Should be a comma separated list of numbers.", null, 6);
                        objA = Unit.f29295attabal;
                    }
                }
                return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
            }
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_INSTRUMENT;
    }
}

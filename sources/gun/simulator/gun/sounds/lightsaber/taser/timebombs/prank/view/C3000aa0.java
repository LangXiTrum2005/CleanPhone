package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3000aa0 extends WG implements InterfaceC3567gx {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3000aa0(int i, Object obj, boolean z) {
        super(2);
        this.f = i;
        this.h = obj;
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf A[LOOP:0: B:40:0x0099->B:51:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x010d A[LOOP:2: B:56:0x00d9->B:67:0x010d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x010f  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x010f A[SYNTHETIC] */
    public final C4839vT a(CharSequence charSequence, int i) {
        Object next;
        String str;
        C4839vT c4839vT;
        String str2;
        Object next2;
        String str3;
        String str4;
        Object obj;
        int i2 = this.f;
        Object obj2 = this.h;
        switch (i2) {
            case 0:
                AbstractC2995aW.q(charSequence, "$this$$receiver");
                int iU0 = AbstractC3089ba0.u0(i, charSequence, this.g, (char[]) obj2);
                if (iU0 < 0) {
                    return null;
                }
                return new C4839vT(Integer.valueOf(iU0), 1);
            default:
                AbstractC2995aW.q(charSequence, "$this$$receiver");
                List list = (List) obj2;
                boolean z = this.g;
                if (z || list.size() != 1) {
                    if (i < 0) {
                        i = 0;
                    }
                    C5175zD c5175zD = new C5175zD(i, charSequence.length(), 1);
                    boolean z2 = charSequence instanceof String;
                    int i3 = c5175zD.c;
                    int i4 = c5175zD.b;
                    if (z2) {
                        if ((i3 <= 0 || i > i4) && (i3 >= 0 || i4 > i)) {
                            c4839vT = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        c4839vT = new C4839vT(Integer.valueOf(i), str3);
                                    } else if (i != i4) {
                                        i += i3;
                                    } else {
                                        c4839vT = null;
                                    }
                                } while (!AbstractC3089ba0.B0(str4, 0, (String) charSequence, i, str4.length(), z));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    c4839vT = new C4839vT(Integer.valueOf(i), str3);
                                } else if (i != i4) {
                                    i += i3;
                                } else {
                                    c4839vT = null;
                                }
                            }
                        }
                    } else if ((i3 <= 0 || i > i4) && (i3 >= 0 || i4 > i)) {
                        c4839vT = null;
                    } else {
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    c4839vT = new C4839vT(Integer.valueOf(i), str);
                                } else if (i != i4) {
                                    i += i3;
                                } else {
                                    c4839vT = null;
                                }
                            } while (!AbstractC3089ba0.C0(str2, 0, charSequence, i, str2.length(), z));
                            str = (String) next;
                            if (str != null) {
                                c4839vT = new C4839vT(Integer.valueOf(i), str);
                            } else if (i != i4) {
                                i += i3;
                            } else {
                                c4839vT = null;
                            }
                        }
                    }
                } else {
                    List list2 = list;
                    if (list2 instanceof List) {
                        List list3 = list2;
                        int size = list3.size();
                        if (size == 0) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        if (size != 1) {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                        obj = list3.get(0);
                    } else {
                        Iterator it3 = list2.iterator();
                        if (!it3.hasNext()) {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                        Object next3 = it3.next();
                        if (it3.hasNext()) {
                            throw new IllegalArgumentException("Collection has more than one element.");
                        }
                        obj = next3;
                    }
                    String str5 = (String) obj;
                    int iT0 = AbstractC3089ba0.t0(charSequence, str5, i, false, 4);
                    if (iT0 < 0) {
                        c4839vT = null;
                    } else {
                        c4839vT = new C4839vT(Integer.valueOf(iT0), str5);
                    }
                }
                if (c4839vT == null) {
                    return null;
                }
                return new C4839vT(c4839vT.f5132a, Integer.valueOf(((String) c4839vT.b).length()));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                return a((CharSequence) obj, ((Number) obj2).intValue());
            case 1:
                return a((CharSequence) obj, ((Number) obj2).intValue());
            default:
                return ((InterfaceC3549gk) obj).plus((InterfaceC3373ek) obj2);
        }
    }
}

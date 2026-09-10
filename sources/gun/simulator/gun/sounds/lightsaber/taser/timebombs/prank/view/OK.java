package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class OK implements QG, InterfaceC4968wt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3500a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public static HashSet d() {
        Uo0 uo0;
        Uo0 uo1;
        HashSet hashSet = new HashSet();
        for (NK nk : NK.e.values()) {
            if (nk != null && (uo1 = nk.d) != null) {
                hashSet.add(AbstractC2845Vx.F(uo1.LD(), uo1.STP()).getAbsolutePath());
                hashSet.add(AbstractC2845Vx.Y(uo1.LD(), uo1.STP()).getAbsolutePath());
            }
        }
        for (MG mg : Po0.f3574a.values()) {
            if (mg != null && (uo0 = mg.b) != null) {
                hashSet.add(AbstractC2845Vx.F(uo0.LD(), uo0.STP()).getAbsolutePath());
                hashSet.add(AbstractC2845Vx.Y(uo0.LD(), uo0.STP()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    public final String a() {
        if (((String) this.h) == null) {
            this.h = ((String) this.e) + File.separator + ((String) this.c);
            File file = new File((String) this.h);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.h;
    }

    public final String b() {
        if (((String) this.f) == null) {
            this.f = ((String) this.e) + File.separator + ((String) this.f3500a);
            File file = new File((String) this.f);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f;
    }

    public final synchronized void c() {
        try {
            ArrayList<EK> arrayListE = e();
            if (Build.VERSION.SDK_INT >= 23) {
                HashSet hashSetD = null;
                for (EK ek : arrayListE) {
                    File[] fileArr = ek.f3020a;
                    if (fileArr != null && fileArr.length >= ek.b) {
                        if (hashSetD == null) {
                            hashSetD = d();
                        }
                        int i = ek.b - 2;
                        if (i < 0) {
                            i = 0;
                        }
                        File[] fileArr2 = ek.f3020a;
                        if (i >= 0 && fileArr2 != null) {
                            if (fileArr2.length > i) {
                                List listAsList = Arrays.asList(fileArr2);
                                Collections.sort(listAsList, new C2607Mt(2));
                                while (i < listAsList.size()) {
                                    if (!hashSetD.contains(((File) listAsList.get(i)).getAbsolutePath())) {
                                        ((File) listAsList.get(i)).delete();
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new EK(new File(b()).listFiles(), AbstractC4496rb.m));
        arrayList.add(new EK(new File(a()).listFiles(), AbstractC4496rb.l));
        if (((String) this.g) == null) {
            this.g = ((String) this.e) + File.separator + ((String) this.b);
            File file = new File((String) this.g);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        arrayList.add(new EK(new File((String) this.g).listFiles(), AbstractC4496rb.n));
        arrayList.add(new EK(new File(f()).listFiles(), AbstractC4496rb.o));
        return arrayList;
    }

    public final String f() {
        if (((String) this.i) == null) {
            this.i = ((String) this.e) + File.separator + ((String) this.d);
            File file = new File((String) this.i);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5194zW
    public final Object get() {
        return new C5123yg0((Context) ((InterfaceC5194zW) this.f3500a).get(), (C4571sP) ((InterfaceC5194zW) this.b).get(), (InterfaceC3562gs) ((InterfaceC5194zW) this.c).get(), (InterfaceC3466fm0) ((InterfaceC5194zW) this.d).get(), (Executor) ((InterfaceC5194zW) this.e).get(), (La0) ((InterfaceC5194zW) this.f).get(), (InterfaceC2438Gf) ((InterfaceC5194zW) this.g).get(), (InterfaceC2438Gf) ((InterfaceC5194zW) this.h).get(), (InterfaceC4768uf) ((InterfaceC5194zW) this.i).get());
    }
}

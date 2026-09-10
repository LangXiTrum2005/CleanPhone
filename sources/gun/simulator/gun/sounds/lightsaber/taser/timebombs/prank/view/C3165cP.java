package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3165cP implements UT, InterfaceC4973wy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f4221a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final C3077bP e;

    public C3165cP(C3077bP c3077bP) {
        c3077bP.getClass();
        this.e = c3077bP;
    }

    public final void a(Path.Op op) {
        Matrix matrixE;
        Matrix matrixE2;
        Path path = this.b;
        path.reset();
        Path path2 = this.f4221a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            UT ut = (UT) arrayList.get(size);
            if (ut instanceof C2623Nj) {
                C2623Nj c2623Nj = (C2623Nj) ut;
                ArrayList arrayList2 = (ArrayList) c2623Nj.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((UT) arrayList2.get(size2)).getPath();
                    Fd0 fd0 = c2623Nj.k;
                    if (fd0 != null) {
                        matrixE2 = fd0.e();
                    } else {
                        matrixE2 = c2623Nj.c;
                        matrixE2.reset();
                    }
                    path3.transform(matrixE2);
                    path.addPath(path3);
                }
            } else {
                path.addPath(ut.getPath());
            }
        }
        int i = 0;
        UT ut2 = (UT) arrayList.get(0);
        if (ut2 instanceof C2623Nj) {
            C2623Nj c2623Nj2 = (C2623Nj) ut2;
            List listE = c2623Nj2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listE;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((UT) arrayList3.get(i)).getPath();
                Fd0 fd1 = c2623Nj2.k;
                if (fd1 != null) {
                    matrixE = fd1.e();
                } else {
                    matrixE = c2623Nj2.c;
                    matrixE.reset();
                }
                path4.transform(matrixE);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(ut2.getPath());
        }
        this.c.op(path2, path, op);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2546Kj
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((UT) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4973wy
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC2546Kj interfaceC2546Kj = (InterfaceC2546Kj) listIterator.previous();
            if (interfaceC2546Kj instanceof UT) {
                this.d.add((UT) interfaceC2546Kj);
                listIterator.remove();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UT
    public final Path getPath() {
        Path path = this.c;
        path.reset();
        C3077bP c3077bP = this.e;
        if (c3077bP.b) {
            return path;
        }
        int iD = DM.D(c3077bP.f4169a);
        if (iD == 0) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                }
                path.addPath(((UT) arrayList.get(i)).getPath());
                i++;
            }
        } else if (iD == 1) {
            a(Path.Op.UNION);
        } else if (iD == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (iD == 3) {
            a(Path.Op.INTERSECT);
        } else if (iD == 4) {
            a(Path.Op.XOR);
        }
        return path;
    }
}

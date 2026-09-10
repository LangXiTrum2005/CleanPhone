package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: compiled from: OpReorderer.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f13450attabal;

    /* JADX INFO: compiled from: OpReorderer.java */
    public interface attabal {
        androidx.recyclerview.widget.attabal.saneness attabal(int i, int i2, int i3, Object obj);

        void saneness(androidx.recyclerview.widget.attabal.saneness sanenessVar);
    }

    public impromptu(attabal attabalVar) {
        this.f13450attabal = attabalVar;
    }

    public final int attabal(List<androidx.recyclerview.widget.attabal.saneness> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f13382attabal != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public void beachfront(List<androidx.recyclerview.widget.attabal.saneness> list, int i, androidx.recyclerview.widget.attabal.saneness sanenessVar, int i2, androidx.recyclerview.widget.attabal.saneness sanenessVar2) {
        androidx.recyclerview.widget.attabal.saneness sanenessVarAttabal;
        int i3;
        int i4;
        int i5;
        int i6 = sanenessVar.f13385wireman;
        int i7 = sanenessVar2.f13384saneness;
        androidx.recyclerview.widget.attabal.saneness sanenessVarAttabal2 = null;
        if (i6 >= i7) {
            int i8 = sanenessVar2.f13385wireman;
            if (i6 < i7 + i8) {
                sanenessVar2.f13385wireman = i8 - 1;
                sanenessVarAttabal = this.f13450attabal.attabal(4, sanenessVar.f13384saneness, 1, sanenessVar2.f13383dern);
            }
            i3 = sanenessVar.f13384saneness;
            i4 = sanenessVar2.f13384saneness;
            if (i3 <= i4) {
                sanenessVar2.f13384saneness = i4 + 1;
            } else {
                i5 = sanenessVar2.f13385wireman;
                if (i3 < i4 + i5) {
                    int i9 = (i4 + i5) - i3;
                    sanenessVarAttabal2 = this.f13450attabal.attabal(4, i3 + 1, i9, sanenessVar2.f13383dern);
                    sanenessVar2.f13385wireman -= i9;
                }
            }
            list.set(i2, sanenessVar);
            if (sanenessVar2.f13385wireman > 0) {
                list.set(i, sanenessVar2);
            } else {
                list.remove(i);
                this.f13450attabal.saneness(sanenessVar2);
            }
            if (sanenessVarAttabal != null) {
                list.add(i, sanenessVarAttabal);
            }
            if (sanenessVarAttabal2 != null) {
                list.add(i, sanenessVarAttabal2);
            }
        }
        sanenessVar2.f13384saneness = i7 - 1;
        sanenessVarAttabal = null;
        i3 = sanenessVar.f13384saneness;
        i4 = sanenessVar2.f13384saneness;
        if (i3 <= i4) {
            sanenessVar2.f13384saneness = i4 + 1;
        } else {
            i5 = sanenessVar2.f13385wireman;
            if (i3 < i4 + i5) {
                int i10 = (i4 + i5) - i3;
                sanenessVarAttabal2 = this.f13450attabal.attabal(4, i3 + 1, i10, sanenessVar2.f13383dern);
                sanenessVar2.f13385wireman -= i10;
            }
        }
        list.set(i2, sanenessVar);
        if (sanenessVar2.f13385wireman > 0) {
            list.set(i, sanenessVar2);
        } else {
            list.remove(i);
            this.f13450attabal.saneness(sanenessVar2);
        }
        if (sanenessVarAttabal != null) {
            list.add(i, sanenessVarAttabal);
        }
        if (sanenessVarAttabal2 != null) {
            list.add(i, sanenessVarAttabal2);
        }
    }

    public final void dern(List<androidx.recyclerview.widget.attabal.saneness> list, int i, androidx.recyclerview.widget.attabal.saneness sanenessVar, int i2, androidx.recyclerview.widget.attabal.saneness sanenessVar2) {
        int i3 = sanenessVar.f13385wireman;
        int i4 = sanenessVar2.f13384saneness;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = sanenessVar.f13384saneness;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            sanenessVar.f13384saneness = i6 + sanenessVar2.f13385wireman;
        }
        int i7 = sanenessVar2.f13384saneness;
        if (i7 <= i3) {
            sanenessVar.f13385wireman = i3 + sanenessVar2.f13385wireman;
        }
        sanenessVar2.f13384saneness = i7 + i5;
        list.set(i, sanenessVar2);
        list.set(i2, sanenessVar);
    }

    public void marial(List<androidx.recyclerview.widget.attabal.saneness> list, int i, androidx.recyclerview.widget.attabal.saneness sanenessVar, int i2, androidx.recyclerview.widget.attabal.saneness sanenessVar2) {
        boolean z;
        int i3 = sanenessVar.f13384saneness;
        int i4 = sanenessVar.f13385wireman;
        boolean z2 = false;
        if (i3 < i4) {
            if (sanenessVar2.f13384saneness == i3 && sanenessVar2.f13385wireman == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (sanenessVar2.f13384saneness == i4 + 1 && sanenessVar2.f13385wireman == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = sanenessVar2.f13384saneness;
        if (i4 < i5) {
            sanenessVar2.f13384saneness = i5 - 1;
        } else {
            int i6 = sanenessVar2.f13385wireman;
            if (i4 < i5 + i6) {
                sanenessVar2.f13385wireman = i6 - 1;
                sanenessVar.f13382attabal = 2;
                sanenessVar.f13385wireman = 1;
                if (sanenessVar2.f13385wireman == 0) {
                    list.remove(i2);
                    this.f13450attabal.saneness(sanenessVar2);
                    return;
                }
                return;
            }
        }
        int i7 = sanenessVar.f13384saneness;
        int i8 = sanenessVar2.f13384saneness;
        androidx.recyclerview.widget.attabal.saneness sanenessVarAttabal = null;
        if (i7 <= i8) {
            sanenessVar2.f13384saneness = i8 + 1;
        } else {
            int i9 = sanenessVar2.f13385wireman;
            if (i7 < i8 + i9) {
                sanenessVarAttabal = this.f13450attabal.attabal(2, i7 + 1, (i8 + i9) - i7, null);
                sanenessVar2.f13385wireman = sanenessVar.f13384saneness - sanenessVar2.f13384saneness;
            }
        }
        if (z2) {
            list.set(i, sanenessVar2);
            list.remove(i2);
            this.f13450attabal.saneness(sanenessVar);
            return;
        }
        if (z) {
            if (sanenessVarAttabal != null) {
                int i10 = sanenessVar.f13384saneness;
                if (i10 > sanenessVarAttabal.f13384saneness) {
                    sanenessVar.f13384saneness = i10 - sanenessVarAttabal.f13385wireman;
                }
                int i11 = sanenessVar.f13385wireman;
                if (i11 > sanenessVarAttabal.f13384saneness) {
                    sanenessVar.f13385wireman = i11 - sanenessVarAttabal.f13385wireman;
                }
            }
            int i12 = sanenessVar.f13384saneness;
            if (i12 > sanenessVar2.f13384saneness) {
                sanenessVar.f13384saneness = i12 - sanenessVar2.f13385wireman;
            }
            int i13 = sanenessVar.f13385wireman;
            if (i13 > sanenessVar2.f13384saneness) {
                sanenessVar.f13385wireman = i13 - sanenessVar2.f13385wireman;
            }
        } else {
            if (sanenessVarAttabal != null) {
                int i14 = sanenessVar.f13384saneness;
                if (i14 >= sanenessVarAttabal.f13384saneness) {
                    sanenessVar.f13384saneness = i14 - sanenessVarAttabal.f13385wireman;
                }
                int i15 = sanenessVar.f13385wireman;
                if (i15 >= sanenessVarAttabal.f13384saneness) {
                    sanenessVar.f13385wireman = i15 - sanenessVarAttabal.f13385wireman;
                }
            }
            int i16 = sanenessVar.f13384saneness;
            if (i16 >= sanenessVar2.f13384saneness) {
                sanenessVar.f13384saneness = i16 - sanenessVar2.f13385wireman;
            }
            int i17 = sanenessVar.f13385wireman;
            if (i17 >= sanenessVar2.f13384saneness) {
                sanenessVar.f13385wireman = i17 - sanenessVar2.f13385wireman;
            }
        }
        list.set(i, sanenessVar2);
        if (sanenessVar.f13384saneness != sanenessVar.f13385wireman) {
            list.set(i2, sanenessVar);
        } else {
            list.remove(i2);
        }
        if (sanenessVarAttabal != null) {
            list.add(i, sanenessVarAttabal);
        }
    }

    public void saneness(List<androidx.recyclerview.widget.attabal.saneness> list) {
        while (true) {
            int iAttabal = attabal(list);
            if (iAttabal == -1) {
                return;
            } else {
                wireman(list, iAttabal, iAttabal + 1);
            }
        }
    }

    public final void wireman(List<androidx.recyclerview.widget.attabal.saneness> list, int i, int i2) {
        androidx.recyclerview.widget.attabal.saneness sanenessVar = list.get(i);
        androidx.recyclerview.widget.attabal.saneness sanenessVar2 = list.get(i2);
        int i3 = sanenessVar2.f13382attabal;
        if (i3 == 1) {
            dern(list, i, sanenessVar, i2, sanenessVar2);
        } else if (i3 == 2) {
            marial(list, i, sanenessVar, i2, sanenessVar2);
        } else {
            if (i3 != 4) {
                return;
            }
            beachfront(list, i, sanenessVar, i2, sanenessVar2);
        }
    }
}

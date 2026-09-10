package androidx.recyclerview.widget;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AdapterHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements impromptu.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public technofreak.competently<saneness> f13374attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f13375beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final impromptu f13376competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ArrayList<saneness> f13377dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f13378impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Runnable f13379marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ArrayList<saneness> f13380saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final InterfaceC0096attabal f13381wireman;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdapterHelper.java */
    public interface InterfaceC0096attabal {
        void attabal(int i, int i2);

        RecyclerView.stratoscope beachfront(int i);

        void competently(int i, int i2);

        void dern(saneness sanenessVar);

        void impromptu(int i, int i2);

        void marial(int i, int i2, Object obj);

        void saneness(saneness sanenessVar);

        void wireman(int i, int i2);
    }

    /* JADX INFO: compiled from: AdapterHelper.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f13382attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Object f13383dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f13384saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f13385wireman;

        public saneness(int i, int i2, int i3, Object obj) {
            this.f13382attabal = i;
            this.f13384saneness = i2;
            this.f13385wireman = i3;
            this.f13383dern = obj;
        }

        public String attabal() {
            int i = this.f13382attabal;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof saneness)) {
                return false;
            }
            saneness sanenessVar = (saneness) obj;
            int i = this.f13382attabal;
            if (i != sanenessVar.f13382attabal) {
                return false;
            }
            if (i == 8 && Math.abs(this.f13385wireman - this.f13384saneness) == 1 && this.f13385wireman == sanenessVar.f13384saneness && this.f13384saneness == sanenessVar.f13385wireman) {
                return true;
            }
            if (this.f13385wireman != sanenessVar.f13385wireman || this.f13384saneness != sanenessVar.f13384saneness) {
                return false;
            }
            Object obj2 = this.f13383dern;
            if (obj2 != null) {
                if (!obj2.equals(sanenessVar.f13383dern)) {
                    return false;
                }
            } else if (sanenessVar.f13383dern != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f13382attabal * 31) + this.f13384saneness) * 31) + this.f13385wireman;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + X3.j.d + attabal() + ",s:" + this.f13384saneness + "c:" + this.f13385wireman + ",p:" + this.f13383dern + X3.j.e;
        }
    }

    public attabal(InterfaceC0096attabal interfaceC0096attabal) {
        this(interfaceC0096attabal, false);
    }

    public boolean adultoid(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f13380saneness.add(attabal(2, i, i2, null));
        this.f13378impromptu |= 2;
        return this.f13380saneness.size() == 1;
    }

    public final void apical(saneness sanenessVar) {
        int i;
        int i2 = sanenessVar.f13382attabal;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iCord = cord(sanenessVar.f13384saneness, i2);
        int i3 = sanenessVar.f13384saneness;
        int i4 = sanenessVar.f13382attabal;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + sanenessVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < sanenessVar.f13385wireman; i6++) {
            int iCord2 = cord(sanenessVar.f13384saneness + (i * i6), sanenessVar.f13382attabal);
            int i7 = sanenessVar.f13382attabal;
            if (i7 == 2 ? iCord2 != iCord : !(i7 == 4 && iCord2 == iCord + 1)) {
                saneness sanenessVarAttabal = attabal(i7, iCord, i5, sanenessVar.f13383dern);
                formularize(sanenessVarAttabal, i3);
                saneness(sanenessVarAttabal);
                if (sanenessVar.f13382attabal == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iCord = iCord2;
            } else {
                i5++;
            }
        }
        Object obj = sanenessVar.f13383dern;
        saneness(sanenessVar);
        if (i5 > 0) {
            saneness sanenessVarAttabal2 = attabal(sanenessVar.f13382attabal, iCord, i5, obj);
            formularize(sanenessVarAttabal2, i3);
            saneness(sanenessVarAttabal2);
        }
    }

    public boolean arytenoidectomy() {
        return this.f13380saneness.size() > 0;
    }

    @Override // androidx.recyclerview.widget.impromptu.attabal
    public saneness attabal(int i, int i2, int i3, Object obj) {
        saneness sanenessVarSaneness = this.f13374attabal.saneness();
        if (sanenessVarSaneness == null) {
            return new saneness(i, i2, i3, obj);
        }
        sanenessVarSaneness.f13382attabal = i;
        sanenessVarSaneness.f13384saneness = i2;
        sanenessVarSaneness.f13385wireman = i3;
        sanenessVarSaneness.f13383dern = obj;
        return sanenessVarSaneness;
    }

    public final void beachfront(saneness sanenessVar) {
        boolean z;
        byte b;
        int i = sanenessVar.f13384saneness;
        int i2 = sanenessVar.f13385wireman + i;
        byte b2 = -1;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f13381wireman.beachfront(i3) != null || impromptu(i3)) {
                if (b2 == 0) {
                    apical(attabal(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b = 1;
            } else {
                if (b2 == 1) {
                    dovishness(attabal(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            b2 = b;
        }
        if (i4 != sanenessVar.f13385wireman) {
            saneness(sanenessVar);
            sanenessVar = attabal(2, i, i4, null);
        }
        if (b2 == 0) {
            apical(sanenessVar);
        } else {
            dovishness(sanenessVar);
        }
    }

    public final void competently(saneness sanenessVar) {
        int i = sanenessVar.f13384saneness;
        int i2 = sanenessVar.f13385wireman + i;
        int i3 = 0;
        byte b = -1;
        int i4 = i;
        while (i < i2) {
            if (this.f13381wireman.beachfront(i) != null || impromptu(i)) {
                if (b == 0) {
                    apical(attabal(4, i4, i3, sanenessVar.f13383dern));
                    i4 = i;
                    i3 = 0;
                }
                b = 1;
            } else {
                if (b == 1) {
                    dovishness(attabal(4, i4, i3, sanenessVar.f13383dern));
                    i4 = i;
                    i3 = 0;
                }
                b = 0;
            }
            i3++;
            i++;
        }
        if (i3 != sanenessVar.f13385wireman) {
            Object obj = sanenessVar.f13383dern;
            saneness(sanenessVar);
            sanenessVar = attabal(4, i4, i3, obj);
        }
        if (b == 0) {
            apical(sanenessVar);
        } else {
            dovishness(sanenessVar);
        }
    }

    public final int cord(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f13377dern.size() - 1; size >= 0; size--) {
            saneness sanenessVar = this.f13377dern.get(size);
            int i5 = sanenessVar.f13382attabal;
            if (i5 == 8) {
                int i6 = sanenessVar.f13384saneness;
                int i7 = sanenessVar.f13385wireman;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            sanenessVar.f13384saneness = i6 + 1;
                            sanenessVar.f13385wireman = i7 + 1;
                        } else if (i2 == 2) {
                            sanenessVar.f13384saneness = i6 - 1;
                            sanenessVar.f13385wireman = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        sanenessVar.f13385wireman = i7 + 1;
                    } else if (i2 == 2) {
                        sanenessVar.f13385wireman = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        sanenessVar.f13384saneness = i6 + 1;
                    } else if (i2 == 2) {
                        sanenessVar.f13384saneness = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = sanenessVar.f13384saneness;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= sanenessVar.f13385wireman;
                    } else if (i5 == 2) {
                        i += sanenessVar.f13385wireman;
                    }
                } else if (i2 == 1) {
                    sanenessVar.f13384saneness = i8 + 1;
                } else if (i2 == 2) {
                    sanenessVar.f13384saneness = i8 - 1;
                }
            }
        }
        for (int size2 = this.f13377dern.size() - 1; size2 >= 0; size2--) {
            saneness sanenessVar2 = this.f13377dern.get(size2);
            if (sanenessVar2.f13382attabal == 8) {
                int i9 = sanenessVar2.f13385wireman;
                if (i9 == sanenessVar2.f13384saneness || i9 < 0) {
                    this.f13377dern.remove(size2);
                    saneness(sanenessVar2);
                }
            } else if (sanenessVar2.f13385wireman <= 0) {
                this.f13377dern.remove(size2);
                saneness(sanenessVar2);
            }
        }
        return i;
    }

    public void cutely() {
        taiyuan();
        int size = this.f13380saneness.size();
        for (int i = 0; i < size; i++) {
            saneness sanenessVar = this.f13380saneness.get(i);
            int i2 = sanenessVar.f13382attabal;
            if (i2 == 1) {
                this.f13381wireman.dern(sanenessVar);
                this.f13381wireman.competently(sanenessVar.f13384saneness, sanenessVar.f13385wireman);
            } else if (i2 == 2) {
                this.f13381wireman.dern(sanenessVar);
                this.f13381wireman.impromptu(sanenessVar.f13384saneness, sanenessVar.f13385wireman);
            } else if (i2 == 4) {
                this.f13381wireman.dern(sanenessVar);
                this.f13381wireman.marial(sanenessVar.f13384saneness, sanenessVar.f13385wireman, sanenessVar.f13383dern);
            } else if (i2 == 8) {
                this.f13381wireman.dern(sanenessVar);
                this.f13381wireman.attabal(sanenessVar.f13384saneness, sanenessVar.f13385wireman);
            }
            Runnable runnable = this.f13379marial;
            if (runnable != null) {
                runnable.run();
            }
        }
        rotuma(this.f13380saneness);
        this.f13378impromptu = 0;
    }

    public final void dern(saneness sanenessVar) {
        dovishness(sanenessVar);
    }

    public final void dovishness(saneness sanenessVar) {
        this.f13377dern.add(sanenessVar);
        int i = sanenessVar.f13382attabal;
        if (i == 1) {
            this.f13381wireman.competently(sanenessVar.f13384saneness, sanenessVar.f13385wireman);
            return;
        }
        if (i == 2) {
            this.f13381wireman.wireman(sanenessVar.f13384saneness, sanenessVar.f13385wireman);
            return;
        }
        if (i == 4) {
            this.f13381wireman.marial(sanenessVar.f13384saneness, sanenessVar.f13385wireman, sanenessVar.f13383dern);
        } else {
            if (i == 8) {
                this.f13381wireman.attabal(sanenessVar.f13384saneness, sanenessVar.f13385wireman);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + sanenessVar);
        }
    }

    public void formularize(saneness sanenessVar, int i) {
        this.f13381wireman.saneness(sanenessVar);
        int i2 = sanenessVar.f13382attabal;
        if (i2 == 2) {
            this.f13381wireman.impromptu(i, sanenessVar.f13385wireman);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f13381wireman.marial(i, sanenessVar.f13385wireman, sanenessVar.f13383dern);
        }
    }

    public void gintrap() {
        this.f13376competently.saneness(this.f13380saneness);
        int size = this.f13380saneness.size();
        for (int i = 0; i < size; i++) {
            saneness sanenessVar = this.f13380saneness.get(i);
            int i2 = sanenessVar.f13382attabal;
            if (i2 == 1) {
                dern(sanenessVar);
            } else if (i2 == 2) {
                beachfront(sanenessVar);
            } else if (i2 == 4) {
                competently(sanenessVar);
            } else if (i2 == 8) {
                wireman(sanenessVar);
            }
            Runnable runnable = this.f13379marial;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f13380saneness.clear();
    }

    public boolean graveside(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f13380saneness.add(attabal(8, i, i2, null));
        this.f13378impromptu |= 8;
        return this.f13380saneness.size() == 1;
    }

    public int impassible(int i) {
        return triweekly(i, 0);
    }

    public final boolean impromptu(int i) {
        int size = this.f13377dern.size();
        for (int i2 = 0; i2 < size; i2++) {
            saneness sanenessVar = this.f13377dern.get(i2);
            int i3 = sanenessVar.f13382attabal;
            if (i3 == 8) {
                if (triweekly(sanenessVar.f13385wireman, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = sanenessVar.f13384saneness;
                int i5 = sanenessVar.f13385wireman + i4;
                while (i4 < i5) {
                    if (triweekly(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean kowloon(int i) {
        return (i & this.f13378impromptu) != 0;
    }

    public int marial(int i) {
        int size = this.f13380saneness.size();
        for (int i2 = 0; i2 < size; i2++) {
            saneness sanenessVar = this.f13380saneness.get(i2);
            int i3 = sanenessVar.f13382attabal;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = sanenessVar.f13384saneness;
                    if (i4 <= i) {
                        int i5 = sanenessVar.f13385wireman;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = sanenessVar.f13384saneness;
                    if (i6 == i) {
                        i = sanenessVar.f13385wireman;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (sanenessVar.f13385wireman <= i) {
                            i++;
                        }
                    }
                }
            } else if (sanenessVar.f13384saneness <= i) {
                i += sanenessVar.f13385wireman;
            }
        }
        return i;
    }

    public boolean molybdenite(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f13380saneness.add(attabal(1, i, i2, null));
        this.f13378impromptu |= 1;
        return this.f13380saneness.size() == 1;
    }

    public boolean monoploid() {
        return (this.f13377dern.isEmpty() || this.f13380saneness.isEmpty()) ? false : true;
    }

    public boolean polloi(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f13380saneness.add(attabal(4, i, i2, obj));
        this.f13378impromptu |= 4;
        return this.f13380saneness.size() == 1;
    }

    public void preprohormone() {
        rotuma(this.f13380saneness);
        rotuma(this.f13377dern);
        this.f13378impromptu = 0;
    }

    public void rotuma(List<saneness> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            saneness(list.get(i));
        }
        list.clear();
    }

    @Override // androidx.recyclerview.widget.impromptu.attabal
    public void saneness(saneness sanenessVar) {
        if (this.f13375beachfront) {
            return;
        }
        sanenessVar.f13383dern = null;
        this.f13374attabal.attabal(sanenessVar);
    }

    public void taiyuan() {
        int size = this.f13377dern.size();
        for (int i = 0; i < size; i++) {
            this.f13381wireman.dern(this.f13377dern.get(i));
        }
        rotuma(this.f13377dern);
        this.f13378impromptu = 0;
    }

    public int triweekly(int i, int i2) {
        int size = this.f13377dern.size();
        while (i2 < size) {
            saneness sanenessVar = this.f13377dern.get(i2);
            int i3 = sanenessVar.f13382attabal;
            if (i3 == 8) {
                int i4 = sanenessVar.f13384saneness;
                if (i4 == i) {
                    i = sanenessVar.f13385wireman;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (sanenessVar.f13385wireman <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = sanenessVar.f13384saneness;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = sanenessVar.f13385wireman;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += sanenessVar.f13385wireman;
                }
            }
            i2++;
        }
        return i;
    }

    public final void wireman(saneness sanenessVar) {
        dovishness(sanenessVar);
    }

    public attabal(InterfaceC0096attabal interfaceC0096attabal, boolean z) {
        this.f13374attabal = new technofreak.impromptu(30);
        this.f13380saneness = new ArrayList<>();
        this.f13377dern = new ArrayList<>();
        this.f13378impromptu = 0;
        this.f13381wireman = interfaceC0096attabal;
        this.f13375beachfront = z;
        this.f13376competently = new impromptu(this);
    }
}

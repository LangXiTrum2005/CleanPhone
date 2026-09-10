package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Splitter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final com.google.common.base.saneness f21546attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final marial f21547dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f21548saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f21549wireman;

    /* JADX INFO: compiled from: Splitter.java */
    public class attabal implements marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ com.google.common.base.saneness f21550attabal;

        /* JADX INFO: renamed from: com.google.common.base.triweekly$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Splitter.java */
        public class C0309attabal extends wireman {
            public C0309attabal(triweekly triweeklyVar, CharSequence charSequence) {
                super(triweeklyVar, charSequence);
            }

            @Override // com.google.common.base.triweekly.wireman
            public int beachfront(int i) {
                return attabal.this.f21550attabal.dern(this.f21559monoploid, i);
            }

            @Override // com.google.common.base.triweekly.wireman
            public int marial(int i) {
                return i + 1;
            }
        }

        public attabal(com.google.common.base.saneness sanenessVar) {
            this.f21550attabal = sanenessVar;
        }

        @Override // com.google.common.base.triweekly.marial
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public wireman attabal(triweekly triweeklyVar, CharSequence charSequence) {
            return new C0309attabal(triweeklyVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    public class dern implements Iterable<String> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ CharSequence f21553kowloon;

        public dern(CharSequence charSequence) {
            this.f21553kowloon = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return triweekly.this.apical(this.f21553kowloon);
        }

        public String toString() {
            beachfront beachfrontVarCompetently = beachfront.competently(", ");
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder sbSaneness = beachfrontVarCompetently.saneness(sb, this);
            sbSaneness.append(']');
            return sbSaneness.toString();
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    public interface marial {
        Iterator<String> attabal(triweekly triweeklyVar, CharSequence charSequence);
    }

    /* JADX INFO: compiled from: Splitter.java */
    public static abstract class wireman extends AbstractIterator<String> {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public int f21556adultoid;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f21557graveside = 0;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final boolean f21558molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final CharSequence f21559monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final com.google.common.base.saneness f21560polloi;

        public wireman(triweekly triweeklyVar, CharSequence charSequence) {
            this.f21560polloi = triweeklyVar.f21546attabal;
            this.f21558molybdenite = triweeklyVar.f21548saneness;
            this.f21556adultoid = triweeklyVar.f21549wireman;
            this.f21559monoploid = charSequence;
        }

        public abstract int beachfront(int i);

        public abstract int marial(int i);

        @Override // com.google.common.base.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public String attabal() {
            int i = this.f21557graveside;
            while (true) {
                int i2 = this.f21557graveside;
                if (i2 == -1) {
                    return saneness();
                }
                int iBeachfront = beachfront(i2);
                if (iBeachfront == -1) {
                    iBeachfront = this.f21559monoploid.length();
                    this.f21557graveside = -1;
                } else {
                    this.f21557graveside = marial(iBeachfront);
                }
                int i3 = this.f21557graveside;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f21557graveside = i4;
                    if (i4 > this.f21559monoploid.length()) {
                        this.f21557graveside = -1;
                    }
                } else {
                    while (i < iBeachfront && this.f21560polloi.marial(this.f21559monoploid.charAt(i))) {
                        i++;
                    }
                    while (iBeachfront > i && this.f21560polloi.marial(this.f21559monoploid.charAt(iBeachfront - 1))) {
                        iBeachfront--;
                    }
                    if (!this.f21558molybdenite || i != iBeachfront) {
                        int i5 = this.f21556adultoid;
                        if (i5 == 1) {
                            iBeachfront = this.f21559monoploid.length();
                            this.f21557graveside = -1;
                            while (iBeachfront > i && this.f21560polloi.marial(this.f21559monoploid.charAt(iBeachfront - 1))) {
                                iBeachfront--;
                            }
                        } else {
                            this.f21556adultoid = i5 - 1;
                        }
                        return this.f21559monoploid.subSequence(i, iBeachfront).toString();
                    }
                    i = this.f21557graveside;
                }
            }
        }
    }

    public triweekly(marial marialVar) {
        this(marialVar, false, com.google.common.base.saneness.beachfront(), Integer.MAX_VALUE);
    }

    public static triweekly competently(char c) {
        return impromptu(com.google.common.base.saneness.wireman(c));
    }

    public static triweekly impromptu(com.google.common.base.saneness sanenessVar) {
        formularize.triweekly(sanenessVar);
        return new triweekly(new attabal(sanenessVar));
    }

    public static triweekly marial(int i) {
        formularize.marial(i > 0, "The length may not be less than 1");
        return new triweekly(new saneness(i));
    }

    public final Iterator<String> apical(CharSequence charSequence) {
        return this.f21547dern.attabal(this, charSequence);
    }

    public triweekly beachfront() {
        return new triweekly(this.f21547dern, true, this.f21546attabal, this.f21549wireman);
    }

    public List<String> cutely(CharSequence charSequence) {
        formularize.triweekly(charSequence);
        Iterator<String> itApical = apical(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itApical.hasNext()) {
            arrayList.add(itApical.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public triweekly formularize() {
        return impassible(com.google.common.base.saneness.impromptu());
    }

    public triweekly impassible(com.google.common.base.saneness sanenessVar) {
        formularize.triweekly(sanenessVar);
        return new triweekly(this.f21547dern, this.f21548saneness, sanenessVar, this.f21549wireman);
    }

    public Iterable<String> taiyuan(CharSequence charSequence) {
        formularize.triweekly(charSequence);
        return new dern(charSequence);
    }

    public triweekly(marial marialVar, boolean z, com.google.common.base.saneness sanenessVar, int i) {
        this.f21547dern = marialVar;
        this.f21548saneness = z;
        this.f21546attabal = sanenessVar;
        this.f21549wireman = i;
    }

    /* JADX INFO: compiled from: Splitter.java */
    public class saneness implements marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ int f21554attabal;

        public saneness(int i) {
            this.f21554attabal = i;
        }

        @Override // com.google.common.base.triweekly.marial
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public wireman attabal(triweekly triweeklyVar, CharSequence charSequence) {
            return new attabal(triweeklyVar, charSequence);
        }

        /* JADX INFO: compiled from: Splitter.java */
        public class attabal extends wireman {
            public attabal(triweekly triweeklyVar, CharSequence charSequence) {
                super(triweeklyVar, charSequence);
            }

            @Override // com.google.common.base.triweekly.wireman
            public int beachfront(int i) {
                int i2 = i + saneness.this.f21554attabal;
                if (i2 < this.f21559monoploid.length()) {
                    return i2;
                }
                return -1;
            }

            @Override // com.google.common.base.triweekly.wireman
            public int marial(int i) {
                return i;
            }
        }
    }
}

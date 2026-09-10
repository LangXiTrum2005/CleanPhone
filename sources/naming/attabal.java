package naming;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import technofreak.taiyuan;

/* JADX INFO: compiled from: FactoryPools.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final competently<Object> f33667attabal = new C0750attabal();

    /* JADX INFO: compiled from: FactoryPools.java */
    public interface beachfront {
        naming.dern wireman();
    }

    /* JADX INFO: compiled from: FactoryPools.java */
    public interface competently<T> {
        void attabal(T t);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class dern<T> implements competently<List<T>> {
        @Override // naming.attabal.competently
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void attabal(List<T> list) {
            list.clear();
        }
    }

    /* JADX INFO: compiled from: FactoryPools.java */
    public static final class marial<T> implements technofreak.competently<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final wireman<T> f33668attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final technofreak.competently<T> f33669dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final competently<T> f33670saneness;

        public marial(technofreak.competently<T> competentlyVar, wireman<T> wiremanVar, competently<T> competentlyVar2) {
            this.f33669dern = competentlyVar;
            this.f33668attabal = wiremanVar;
            this.f33670saneness = competentlyVar2;
        }

        @Override // technofreak.competently
        public boolean attabal(T t) {
            if (t instanceof beachfront) {
                ((beachfront) t).wireman().saneness(true);
            }
            this.f33670saneness.attabal(t);
            return this.f33669dern.attabal(t);
        }

        @Override // technofreak.competently
        public T saneness() {
            T tSaneness = this.f33669dern.saneness();
            if (tSaneness == null) {
                tSaneness = this.f33668attabal.attabal();
                if (Log.isLoggable("FactoryPools", 2)) {
                    tSaneness.getClass().toString();
                }
            }
            if (tSaneness instanceof beachfront) {
                ((beachfront) tSaneness).wireman().saneness(false);
            }
            return tSaneness;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class saneness<T> implements wireman<List<T>> {
        @Override // naming.attabal.wireman
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public List<T> attabal() {
            return new ArrayList();
        }
    }

    /* JADX INFO: compiled from: FactoryPools.java */
    public interface wireman<T> {
        T attabal();
    }

    public static <T extends beachfront> technofreak.competently<T> attabal(technofreak.competently<T> competentlyVar, wireman<T> wiremanVar) {
        return saneness(competentlyVar, wiremanVar, dern());
    }

    public static <T> technofreak.competently<List<T>> beachfront(int i) {
        return saneness(new taiyuan(i), new saneness(), new dern());
    }

    public static <T> competently<T> dern() {
        return (competently<T>) f33667attabal;
    }

    public static <T> technofreak.competently<List<T>> marial() {
        return beachfront(20);
    }

    public static <T> technofreak.competently<T> saneness(technofreak.competently<T> competentlyVar, wireman<T> wiremanVar, competently<T> competentlyVar2) {
        return new marial(competentlyVar, wiremanVar, competentlyVar2);
    }

    public static <T extends beachfront> technofreak.competently<T> wireman(int i, wireman<T> wiremanVar) {
        return attabal(new taiyuan(i), wiremanVar);
    }

    /* JADX INFO: renamed from: naming.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class C0750attabal implements competently<Object> {
        @Override // naming.attabal.competently
        public void attabal(Object obj) {
        }
    }
}

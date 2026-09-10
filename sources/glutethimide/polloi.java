package glutethimide;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MultiModelLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class polloi<Model, Data> implements kowloon<Model, Data> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<kowloon<Model, Data>> f27272attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final technofreak.competently<List<Throwable>> f27273saneness;

    /* JADX INFO: compiled from: MultiModelLoader.java */
    public static class attabal<Data> implements com.bumptech.glide.load.data.wireman<Data>, com.bumptech.glide.load.data.wireman.attabal<Data> {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public boolean f27274adultoid;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final technofreak.competently<List<Throwable>> f27275arytenoidectomy;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public List<Throwable> f27276graveside;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.wireman<Data>> f27277kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public com.bumptech.glide.load.data.wireman.attabal<? super Data> f27278molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f27279monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public Priority f27280polloi;

        public attabal(List<com.bumptech.glide.load.data.wireman<Data>> list, technofreak.competently<List<Throwable>> competentlyVar) {
            this.f27275arytenoidectomy = competentlyVar;
            com.bumptech.glide.util.apical.dern(list);
            this.f27277kowloon = list;
            this.f27279monoploid = 0;
        }

        @Override // com.bumptech.glide.load.data.wireman
        public Class<Data> attabal() {
            return this.f27277kowloon.get(0).attabal();
        }

        @Override // com.bumptech.glide.load.data.wireman.attabal
        public void beachfront(Data data) {
            if (data != null) {
                this.f27278molybdenite.beachfront(data);
            } else {
                competently();
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void cancel() {
            this.f27274adultoid = true;
            Iterator<com.bumptech.glide.load.data.wireman<Data>> it = this.f27277kowloon.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        public final void competently() {
            if (this.f27274adultoid) {
                return;
            }
            if (this.f27279monoploid < this.f27277kowloon.size() - 1) {
                this.f27279monoploid++;
                marial(this.f27280polloi, this.f27278molybdenite);
            } else {
                com.bumptech.glide.util.apical.wireman(this.f27276graveside);
                this.f27278molybdenite.dern(new GlideException("Fetch failed", new ArrayList(this.f27276graveside)));
            }
        }

        @Override // com.bumptech.glide.load.data.wireman.attabal
        public void dern(Exception exc) {
            ((List) com.bumptech.glide.util.apical.wireman(this.f27276graveside)).add(exc);
            competently();
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void marial(Priority priority, com.bumptech.glide.load.data.wireman.attabal<? super Data> attabalVar) {
            this.f27280polloi = priority;
            this.f27278molybdenite = attabalVar;
            this.f27276graveside = this.f27275arytenoidectomy.saneness();
            this.f27277kowloon.get(this.f27279monoploid).marial(priority, this);
            if (this.f27274adultoid) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public void saneness() {
            List<Throwable> list = this.f27276graveside;
            if (list != null) {
                this.f27275arytenoidectomy.attabal(list);
            }
            this.f27276graveside = null;
            Iterator<com.bumptech.glide.load.data.wireman<Data>> it = this.f27277kowloon.iterator();
            while (it.hasNext()) {
                it.next().saneness();
            }
        }

        @Override // com.bumptech.glide.load.data.wireman
        public DataSource wireman() {
            return this.f27277kowloon.get(0).wireman();
        }
    }

    public polloi(List<kowloon<Model, Data>> list, technofreak.competently<List<Throwable>> competentlyVar) {
        this.f27272attabal = list;
        this.f27273saneness = competentlyVar;
    }

    @Override // glutethimide.kowloon
    public boolean attabal(Model model) {
        Iterator<kowloon<Model, Data>> it = this.f27272attabal.iterator();
        while (it.hasNext()) {
            if (it.next().attabal(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // glutethimide.kowloon
    public kowloon.attabal<Data> saneness(Model model, int i, int i2, maggot.wireman wiremanVar) {
        kowloon.attabal<Data> attabalVarSaneness;
        int size = this.f27272attabal.size();
        ArrayList arrayList = new ArrayList(size);
        maggot.saneness sanenessVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            kowloon<Model, Data> kowloonVar = this.f27272attabal.get(i3);
            if (kowloonVar.attabal(model) && (attabalVarSaneness = kowloonVar.saneness(model, i, i2, wiremanVar)) != null) {
                sanenessVar = attabalVarSaneness.f27250attabal;
                arrayList.add(attabalVarSaneness.f27251dern);
            }
        }
        if (arrayList.isEmpty() || sanenessVar == null) {
            return null;
        }
        return new kowloon.attabal<>(sanenessVar, new attabal(arrayList, this.f27273saneness));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f27272attabal.toArray()) + '}';
    }
}

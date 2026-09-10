package kinesic;

import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: MergePathsContent.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize implements impassible, cutely {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final MergePaths f29202marial;
    private final String name;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Path f29200attabal = new Path();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Path f29203saneness = new Path();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Path f29201dern = new Path();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List<impassible> f29204wireman = new ArrayList();

    /* JADX INFO: compiled from: MergePathsContent.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f29205attabal;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f29205attabal = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29205attabal[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29205attabal[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29205attabal[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29205attabal[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public formularize(MergePaths mergePaths) {
        this.name = mergePaths.dern();
        this.f29202marial = mergePaths;
    }

    public final void attabal() {
        for (int i = 0; i < this.f29204wireman.size(); i++) {
            this.f29201dern.addPath(this.f29204wireman.get(i).getPath());
        }
    }

    @Override // kinesic.impassible
    public Path getPath() {
        this.f29201dern.reset();
        if (this.f29202marial.wireman()) {
            return this.f29201dern;
        }
        int i = attabal.f29205attabal[this.f29202marial.saneness().ordinal()];
        if (i == 1) {
            attabal();
        } else if (i == 2) {
            wireman(Path.Op.UNION);
        } else if (i == 3) {
            wireman(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            wireman(Path.Op.INTERSECT);
        } else if (i == 5) {
            wireman(Path.Op.XOR);
        }
        return this.f29201dern;
    }

    @Override // kinesic.dern
    public void saneness(List<dern> list, List<dern> list2) {
        for (int i = 0; i < this.f29204wireman.size(); i++) {
            this.f29204wireman.get(i).saneness(list, list2);
        }
    }

    @Override // kinesic.cutely
    public void taiyuan(ListIterator<dern> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            dern dernVarPrevious = listIterator.previous();
            if (dernVarPrevious instanceof impassible) {
                this.f29204wireman.add((impassible) dernVarPrevious);
                listIterator.remove();
            }
        }
    }

    public final void wireman(Path.Op op) {
        this.f29203saneness.reset();
        this.f29200attabal.reset();
        for (int size = this.f29204wireman.size() - 1; size >= 1; size--) {
            impassible impassibleVar = this.f29204wireman.get(size);
            if (impassibleVar instanceof wireman) {
                wireman wiremanVar = (wireman) impassibleVar;
                List<impassible> listFormularize = wiremanVar.formularize();
                for (int size2 = listFormularize.size() - 1; size2 >= 0; size2--) {
                    Path path = listFormularize.get(size2).getPath();
                    path.transform(wiremanVar.impassible());
                    this.f29203saneness.addPath(path);
                }
            } else {
                this.f29203saneness.addPath(impassibleVar.getPath());
            }
        }
        impassible impassibleVar2 = this.f29204wireman.get(0);
        if (impassibleVar2 instanceof wireman) {
            wireman wiremanVar2 = (wireman) impassibleVar2;
            List<impassible> listFormularize2 = wiremanVar2.formularize();
            for (int i = 0; i < listFormularize2.size(); i++) {
                Path path2 = listFormularize2.get(i).getPath();
                path2.transform(wiremanVar2.impassible());
                this.f29200attabal.addPath(path2);
            }
        } else {
            this.f29200attabal.set(impassibleVar2.getPath());
        }
        this.f29201dern.op(this.f29200attabal, this.f29203saneness, op);
    }
}

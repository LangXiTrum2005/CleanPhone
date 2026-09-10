package androidx.core.app;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class TaskStackBuilder implements Iterable<Intent> {
    public final ArrayList X = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final AppCompatActivity f4251Y;

    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    public TaskStackBuilder(AppCompatActivity appCompatActivity) {
        this.f4251Y = appCompatActivity;
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.X.iterator();
    }
}

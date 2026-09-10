package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SuggestionsAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class oilcan extends ResourceCursorAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f5514adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final SearchableInfo f5515arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f5516cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public int f5517cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public ColorStateList f5518dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public int f5519gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f5520graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final SearchView f5521kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final int f5522molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Context f5523monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f5524polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public int f5525preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public int f5526rotuma;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public int f5527stratoscope;

    /* JADX INFO: compiled from: SuggestionsAdapter.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final TextView f5528attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final ImageView f5529dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final ImageView f5530marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final TextView f5531saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final ImageView f5532wireman;

        public attabal(View view) {
            this.f5528attabal = (TextView) view.findViewById(R.id.text1);
            this.f5531saneness = (TextView) view.findViewById(R.id.text2);
            this.f5529dern = (ImageView) view.findViewById(R.id.icon1);
            this.f5532wireman = (ImageView) view.findViewById(R.id.icon2);
            this.f5530marial = (ImageView) view.findViewById(beachfront.beachfront.edit_query);
        }
    }

    public oilcan(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f5520graveside = false;
        this.f5514adultoid = 1;
        this.f5519gintrap = -1;
        this.f5526rotuma = -1;
        this.f5525preprohormone = -1;
        this.f5516cord = -1;
        this.f5517cuirassed = -1;
        this.f5527stratoscope = -1;
        this.f5521kowloon = searchView;
        this.f5515arytenoidectomy = searchableInfo;
        this.f5522molybdenite = searchView.getSuggestionCommitIconResId();
        this.f5523monoploid = context;
        this.f5524polloi = weakHashMap;
    }

    public static String impassible(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String marial(Cursor cursor, String str) {
        return impassible(cursor, cursor.getColumnIndex(str));
    }

    public final Drawable apical(Cursor cursor) {
        int i = this.f5517cuirassed;
        if (i == -1) {
            return null;
        }
        return taiyuan(cursor.getString(i));
    }

    public final void arytenoidectomy(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final Drawable attabal(String str) {
        Drawable.ConstantState constantState = this.f5524polloi.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final Drawable beachfront() {
        Drawable drawableWireman = wireman(this.f5515arytenoidectomy.getSearchActivity());
        return drawableWireman != null ? drawableWireman : this.f5523monoploid.getPackageManager().getDefaultActivityIcon();
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        attabal attabalVar = (attabal) view.getTag();
        int i = this.f5527stratoscope;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (attabalVar.f5528attabal != null) {
            arytenoidectomy(attabalVar.f5528attabal, impassible(cursor, this.f5519gintrap));
        }
        if (attabalVar.f5531saneness != null) {
            String strImpassible = impassible(cursor, this.f5525preprohormone);
            CharSequence charSequenceSaneness = strImpassible != null ? saneness(strImpassible) : impassible(cursor, this.f5526rotuma);
            if (TextUtils.isEmpty(charSequenceSaneness)) {
                TextView textView = attabalVar.f5528attabal;
                if (textView != null) {
                    textView.setSingleLine(false);
                    attabalVar.f5528attabal.setMaxLines(2);
                }
            } else {
                TextView textView2 = attabalVar.f5528attabal;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    attabalVar.f5528attabal.setMaxLines(1);
                }
            }
            arytenoidectomy(attabalVar.f5531saneness, charSequenceSaneness);
        }
        ImageView imageView = attabalVar.f5529dern;
        if (imageView != null) {
            kowloon(imageView, cutely(cursor), 4);
        }
        ImageView imageView2 = attabalVar.f5532wireman;
        if (imageView2 != null) {
            kowloon(imageView2, apical(cursor), 8);
        }
        int i3 = this.f5514adultoid;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            attabalVar.f5530marial.setVisibility(8);
            return;
        }
        attabalVar.f5530marial.setVisibility(0);
        attabalVar.f5530marial.setTag(attabalVar.f5528attabal.getText());
        attabalVar.f5530marial.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.attabal.InterfaceC0066attabal
    public void changeCursor(Cursor cursor) {
        if (this.f5520graveside) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f5519gintrap = cursor.getColumnIndex("suggest_text_1");
                this.f5526rotuma = cursor.getColumnIndex("suggest_text_2");
                this.f5525preprohormone = cursor.getColumnIndex("suggest_text_2_url");
                this.f5516cord = cursor.getColumnIndex("suggest_icon_1");
                this.f5517cuirassed = cursor.getColumnIndex("suggest_icon_2");
                this.f5527stratoscope = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    public final Drawable competently(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return impromptu(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f5523monoploid.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException unused2) {
                    uri.toString();
                    return drawableCreateFromStream;
                }
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                    uri.toString();
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            Objects.toString(uri);
            e.getMessage();
            return null;
        }
        Objects.toString(uri);
        e.getMessage();
        return null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.attabal.InterfaceC0066attabal
    public CharSequence convertToString(Cursor cursor) {
        String strMarial;
        String strMarial2;
        if (cursor == null) {
            return null;
        }
        String strMarial3 = marial(cursor, "suggest_intent_query");
        if (strMarial3 != null) {
            return strMarial3;
        }
        if (this.f5515arytenoidectomy.shouldRewriteQueryFromData() && (strMarial2 = marial(cursor, "suggest_intent_data")) != null) {
            return strMarial2;
        }
        if (!this.f5515arytenoidectomy.shouldRewriteQueryFromText() || (strMarial = marial(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strMarial;
    }

    public final Drawable cutely(Cursor cursor) {
        int i = this.f5516cord;
        if (i == -1) {
            return null;
        }
        Drawable drawableTaiyuan = taiyuan(cursor.getString(i));
        return drawableTaiyuan != null ? drawableTaiyuan : beachfront();
    }

    public final Drawable dern(ComponentName componentName) {
        PackageManager packageManager = this.f5523monoploid.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    public Cursor formularize(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f5523monoploid.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewNewDropDownView = newDropDownView(this.f5523monoploid, getCursor(), viewGroup);
            if (viewNewDropDownView != null) {
                ((attabal) viewNewDropDownView.getTag()).f5528attabal.setText(e.toString());
            }
            return viewNewDropDownView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewNewView = newView(this.f5523monoploid, getCursor(), viewGroup);
            if (viewNewView != null) {
                ((attabal) viewNewView.getTag()).f5528attabal.setText(e.toString());
            }
            return viewNewView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public Drawable impromptu(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f5523monoploid.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final void kowloon(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void monoploid(String str, Drawable drawable) {
        if (drawable != null) {
            this.f5524polloi.put(str, drawable.getConstantState());
        }
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewNewView = super.newView(context, cursor, viewGroup);
        viewNewView.setTag(new attabal(viewNewView));
        ((ImageView) viewNewView.findViewById(beachfront.beachfront.edit_query)).setImageResource(this.f5522molybdenite);
        return viewNewView;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        polloi(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        polloi(getCursor());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f5521kowloon.privatdozent((CharSequence) tag);
        }
    }

    public final void polloi(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.attabal.InterfaceC0066attabal
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f5521kowloon.getVisibility() == 0 && this.f5521kowloon.getWindowVisibility() == 0) {
            try {
                Cursor cursorFormularize = formularize(this.f5515arytenoidectomy, string, 50);
                if (cursorFormularize != null) {
                    cursorFormularize.getCount();
                    return cursorFormularize;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    public final CharSequence saneness(CharSequence charSequence) {
        if (this.f5518dovishness == null) {
            TypedValue typedValue = new TypedValue();
            this.f5523monoploid.getTheme().resolveAttribute(beachfront.attabal.textColorSearchUrl, typedValue, true);
            this.f5518dovishness = this.f5523monoploid.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f5518dovishness, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable taiyuan(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f5523monoploid.getPackageName() + "/" + i;
            Drawable drawableAttabal = attabal(str2);
            if (drawableAttabal != null) {
                return drawableAttabal;
            }
            Drawable drawable = picketboat.saneness.getDrawable(this.f5523monoploid, i);
            monoploid(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableAttabal2 = attabal(str);
            if (drawableAttabal2 != null) {
                return drawableAttabal2;
            }
            Drawable drawableCompetently = competently(Uri.parse(str));
            monoploid(str, drawableCompetently);
            return drawableCompetently;
        }
    }

    public void triweekly(int i) {
        this.f5514adultoid = i;
    }

    public final Drawable wireman(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f5524polloi.containsKey(strFlattenToShortString)) {
            Drawable drawableDern = dern(componentName);
            this.f5524polloi.put(strFlattenToShortString, drawableDern != null ? drawableDern.getConstantState() : null);
            return drawableDern;
        }
        Drawable.ConstantState constantState = this.f5524polloi.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f5523monoploid.getResources());
    }
}

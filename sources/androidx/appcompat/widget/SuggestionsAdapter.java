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
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {
    public static final /* synthetic */ int z0 = 0;
    public final SearchView m0;
    public final SearchableInfo n0;
    public final Context o0;
    public final WeakHashMap p0;
    public final int q0;
    public int r0;
    public ColorStateList s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;

    public static final class ChildViewCache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f3632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f3633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f3634c;
        public final ImageView d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f3635e;

        public ChildViewCache(View view) {
            this.f3632a = (TextView) view.findViewById(R.id.text1);
            this.f3633b = (TextView) view.findViewById(R.id.text2);
            this.f3634c = (ImageView) view.findViewById(R.id.icon1);
            this.d = (ImageView) view.findViewById(R.id.icon2);
            this.f3635e = (ImageView) view.findViewById(com.charging.screenshow.battery.animations.themes.R.id.edit_query);
        }
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.r0 = 1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.m0 = searchView;
        this.n0 = searchableInfo;
        this.q0 = searchView.getSuggestionCommitIconResId();
        this.o0 = context;
        this.p0 = weakHashMap;
    }

    public static String k(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.t0 = cursor.getColumnIndex("suggest_text_1");
                this.u0 = cursor.getColumnIndex("suggest_text_2");
                this.v0 = cursor.getColumnIndex("suggest_text_2_url");
                this.w0 = cursor.getColumnIndex("suggest_icon_1");
                this.x0 = cursor.getColumnIndex("suggest_icon_2");
                this.y0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final String b(Cursor cursor) {
        String strK;
        String strK2;
        if (cursor == null) {
            return null;
        }
        String strK3 = k(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strK3 != null) {
            return strK3;
        }
        SearchableInfo searchableInfo = this.n0;
        if (searchableInfo.shouldRewriteQueryFromData() && (strK2 = k(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strK2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strK = k(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strK;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        SearchView searchView = this.m0;
        if (searchView.getVisibility() != 0 || searchView.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursorJ = j(this.n0, string);
            if (cursorJ == null) {
                return null;
            }
            cursorJ.getCount();
            return cursorJ;
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            return null;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final void d(View view, Cursor cursor) {
        int i2;
        Drawable drawableI;
        CharSequence charSequenceK;
        ChildViewCache childViewCache = (ChildViewCache) view.getTag();
        int i3 = this.y0;
        int i4 = i3 != -1 ? cursor.getInt(i3) : 0;
        TextView textView = childViewCache.f3632a;
        if (textView != null) {
            String strK = k(cursor, this.t0);
            textView.setText(strK);
            if (TextUtils.isEmpty(strK)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.o0;
        TextView textView2 = childViewCache.f3633b;
        if (textView2 != null) {
            String strK2 = k(cursor, this.v0);
            if (strK2 != null) {
                if (this.s0 == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(com.charging.screenshow.battery.animations.themes.R.attr.textColorSearchUrl, typedValue, true);
                    this.s0 = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strK2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.s0, null), 0, strK2.length(), 33);
                charSequenceK = spannableString;
            } else {
                charSequenceK = k(cursor, this.u0);
            }
            if (TextUtils.isEmpty(charSequenceK)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceK);
            if (TextUtils.isEmpty(charSequenceK)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = childViewCache.f3634c;
        if (imageView != null) {
            int i5 = this.w0;
            if (i5 == -1) {
                drawableI = null;
            } else {
                drawableI = i(cursor.getString(i5));
                if (drawableI == null) {
                    ComponentName searchActivity = this.n0.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.p0;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableI = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbU = android.support.v4.media.a.u(iconResource, "Invalid icon resource ", " for ");
                                    sbU.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", sbU.toString());
                                    drawableI = null;
                                } else {
                                    drawableI = drawable;
                                }
                            } else {
                                drawableI = null;
                            }
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.w("SuggestionsAdapter", e2.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableI == null ? null : drawableI.getConstantState());
                    }
                    if (drawableI == null) {
                        drawableI = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableI);
            if (drawableI == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableI.setVisible(false, false);
                drawableI.setVisible(true, false);
            }
        }
        ImageView imageView2 = childViewCache.d;
        if (imageView2 == null) {
            i2 = 1;
        } else {
            int i6 = this.x0;
            Drawable drawableI2 = i6 == -1 ? null : i(cursor.getString(i6));
            imageView2.setImageDrawable(drawableI2);
            if (drawableI2 == null) {
                imageView2.setVisibility(8);
                i2 = 1;
            } else {
                imageView2.setVisibility(0);
                drawableI2.setVisible(false, false);
                i2 = 1;
                drawableI2.setVisible(true, false);
            }
        }
        int i7 = this.r0;
        ImageView imageView3 = childViewCache.f3635e;
        if (i7 != 2 && (i7 != i2 || (i4 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public final View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewF = super.f(context, cursor, viewGroup);
        viewF.setTag(new ChildViewCache(viewF));
        ((ImageView) viewF.findViewById(com.charging.screenshow.battery.animations.themes.R.id.edit_query)).setImageResource(this.q0);
        return viewF;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewE = e(this.o0, this.Z, viewGroup);
            if (viewE != null) {
                ((ChildViewCache) viewE.getTag()).f3632a.setText(e2.toString());
            }
            return viewE;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewF = f(this.o0, this.Z, viewGroup);
            ((ChildViewCache) viewF.getTag()).f3632a.setText(e2.toString());
            return viewF;
        }
    }

    public final Drawable h(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(android.support.v4.media.a.k(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.o0.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(android.support.v4.media.a.k(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(android.support.v4.media.a.k(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(android.support.v4.media.a.k(uri, "More than two path segments: "));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(android.support.v4.media.a.k(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(android.support.v4.media.a.k(uri, "No package found for authority: "));
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    public final Drawable i(String str) {
        WeakHashMap weakHashMap = this.p0;
        Context context = this.o0;
        Drawable drawableH = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i2 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i2;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = ContextCompat.getDrawable(context, i2);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableH = h(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e2) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                            }
                            drawableH = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e3) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e3);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e4) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e4.getMessage());
                    if (drawableH != null) {
                        weakHashMap.put(str, drawableH.getConstantState());
                    }
                    return drawableH;
                }
                if (drawableH != null) {
                    weakHashMap.put(str, drawableH.getConstantState());
                }
            }
        }
        return drawableH;
    }

    public final Cursor j(SearchableInfo searchableInfo, String str) {
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
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.o0.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.Z;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.Z;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.m0.r((CharSequence) tag);
        }
    }
}

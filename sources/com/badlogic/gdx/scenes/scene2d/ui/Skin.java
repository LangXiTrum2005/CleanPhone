package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.NinePatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.utils.BaseDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.scenes.scene2d.utils.TiledDrawable;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.SerializationException;
import com.badlogic.gdx.utils.reflect.ClassReflection;
import com.badlogic.gdx.utils.reflect.Method;
import com.badlogic.gdx.utils.reflect.ReflectionException;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class Skin implements Disposable {
    private static final Class[] defaultTagClasses = {BitmapFont.class, Color.class, TintedDrawable.class, NinePatchDrawable.class, SpriteDrawable.class, TextureRegionDrawable.class, TiledDrawable.class, Button.ButtonStyle.class, CheckBox.CheckBoxStyle.class, ImageButton.ImageButtonStyle.class, ImageTextButton.ImageTextButtonStyle.class, Label.LabelStyle.class, List.ListStyle.class, ProgressBar.ProgressBarStyle.class, ScrollPane.ScrollPaneStyle.class, SelectBox.SelectBoxStyle.class, Slider.SliderStyle.class, SplitPane.SplitPaneStyle.class, TextButton.TextButtonStyle.class, TextField.TextFieldStyle.class, TextTooltip.TextTooltipStyle.class, Touchpad.TouchpadStyle.class, Tree.TreeStyle.class, Window.WindowStyle.class};
    TextureAtlas atlas;
    private final ObjectMap<String, Class> jsonClassTags;
    ObjectMap<Class, ObjectMap<String, Object>> resources = new ObjectMap<>();
    float scale = 1.0f;

    public static class TintedDrawable {
        public Color color;
        public String name;
    }

    public Skin() {
        Class[] clsArr = defaultTagClasses;
        this.jsonClassTags = new ObjectMap<>(clsArr.length);
        for (Class cls : clsArr) {
            this.jsonClassTags.put(cls.getSimpleName(), cls);
        }
    }

    @Null
    private static Method findMethod(Class cls, String str) {
        for (Method method : ClassReflection.getMethods(cls)) {
            if (method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    public void add(String str, Object obj) {
        add(str, obj, obj.getClass());
    }

    public void addRegions(TextureAtlas textureAtlas) {
        Array<TextureAtlas.AtlasRegion> regions = textureAtlas.getRegions();
        int i = regions.size;
        for (int i2 = 0; i2 < i; i2++) {
            TextureAtlas.AtlasRegion atlasRegion = regions.get(i2);
            String string = atlasRegion.name;
            if (atlasRegion.index != -1) {
                StringBuilder sbQ = DM.q(string, "_");
                sbQ.append(atlasRegion.index);
                string = sbQ.toString();
            }
            add(string, atlasRegion, TextureRegion.class);
        }
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        TextureAtlas textureAtlas = this.atlas;
        if (textureAtlas != null) {
            textureAtlas.dispose();
        }
        ObjectMap.Values<ObjectMap<String, Object>> it = this.resources.values().iterator();
        while (it.hasNext()) {
            ObjectMap.Values<Object> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof Disposable) {
                    ((Disposable) next).dispose();
                }
            }
        }
    }

    @Null
    public String find(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        ObjectMap<String, Object> objectMap = this.resources.get(obj.getClass());
        if (objectMap == null) {
            return null;
        }
        return objectMap.findKey(obj, true);
    }

    public <T> T get(Class<T> cls) {
        return (T) get(MRAIDCommunicatorUtil.STATES_DEFAULT, cls);
    }

    @Null
    public <T> ObjectMap<String, T> getAll(Class<T> cls) {
        return (ObjectMap) this.resources.get(cls);
    }

    @Null
    public TextureAtlas getAtlas() {
        return this.atlas;
    }

    public Color getColor(String str) {
        return (Color) get(str, Color.class);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    public Drawable getDrawable(String str) {
        NinePatch ninePatch;
        Sprite sprite;
        Drawable spriteDrawable;
        Drawable spriteDrawable2;
        Drawable drawable = (Drawable) optional(str, Drawable.class);
        if (drawable != null) {
            return drawable;
        }
        try {
            TextureRegion region = getRegion(str);
            if (region instanceof TextureAtlas.AtlasRegion) {
                TextureAtlas.AtlasRegion atlasRegion = (TextureAtlas.AtlasRegion) region;
                if (atlasRegion.findValue("split") == null) {
                    if (atlasRegion.rotate || atlasRegion.packedWidth != atlasRegion.originalWidth || atlasRegion.packedHeight != atlasRegion.originalHeight) {
                        spriteDrawable2 = new SpriteDrawable(getSprite(str));
                    }
                    if (drawable == null) {
                        ninePatch = (NinePatch) optional(str, NinePatch.class);
                        if (ninePatch != null) {
                            spriteDrawable = new NinePatchDrawable(ninePatch);
                        } else {
                            sprite = (Sprite) optional(str, Sprite.class);
                            if (sprite != null) {
                                throw new GdxRuntimeException(AbstractC3888ke0.i("No Drawable, NinePatch, TextureRegion, Texture, or Sprite registered with name: ", str));
                            }
                            spriteDrawable = new SpriteDrawable(sprite);
                        }
                        drawable = spriteDrawable;
                    }
                    if (drawable instanceof BaseDrawable) {
                        ((BaseDrawable) drawable).setName(str);
                    }
                    add(str, drawable, Drawable.class);
                    return drawable;
                }
                spriteDrawable2 = new NinePatchDrawable(getPatch(str));
                drawable = spriteDrawable2;
            }
            if (drawable == null) {
                Drawable textureRegionDrawable = new TextureRegionDrawable(region);
                try {
                    if (this.scale != 1.0f) {
                        scale(textureRegionDrawable);
                    }
                } catch (GdxRuntimeException unused) {
                }
                drawable = textureRegionDrawable;
            }
        } catch (GdxRuntimeException unused2) {
        }
        if (drawable == null) {
            ninePatch = (NinePatch) optional(str, NinePatch.class);
            if (ninePatch != null) {
                spriteDrawable = new NinePatchDrawable(ninePatch);
            } else {
                sprite = (Sprite) optional(str, Sprite.class);
                if (sprite != null) {
                    throw new GdxRuntimeException(AbstractC3888ke0.i("No Drawable, NinePatch, TextureRegion, Texture, or Sprite registered with name: ", str));
                }
                spriteDrawable = new SpriteDrawable(sprite);
            }
            drawable = spriteDrawable;
        }
        if (drawable instanceof BaseDrawable) {
            ((BaseDrawable) drawable).setName(str);
        }
        add(str, drawable, Drawable.class);
        return drawable;
    }

    public BitmapFont getFont(String str) {
        return (BitmapFont) get(str, BitmapFont.class);
    }

    public ObjectMap<String, Class> getJsonClassTags() {
        return this.jsonClassTags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Json getJsonLoader(final FileHandle fileHandle) {
        Json json = new Json() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Skin.1
            private static final String parentFieldName = "parent";

            @Override // com.badlogic.gdx.utils.Json
            public boolean ignoreUnknownField(Class cls, String str) {
                return str.equals(parentFieldName);
            }

            @Override // com.badlogic.gdx.utils.Json
            public void readFields(Object obj, JsonValue jsonValue) {
                if (jsonValue.has(parentFieldName)) {
                    String str = (String) readValue(parentFieldName, String.class, jsonValue);
                    Class<?> superclass = obj.getClass();
                    do {
                        try {
                            copyFields(Skin.this.get(str, superclass), obj);
                        } catch (GdxRuntimeException unused) {
                            superclass = superclass.getSuperclass();
                        }
                    } while (superclass != Object.class);
                    SerializationException serializationException = new SerializationException(AbstractC3888ke0.i("Unable to find parent resource with name: ", str));
                    serializationException.addTrace(jsonValue.child.trace());
                    throw serializationException;
                }
                super.readFields(obj, jsonValue);
            }

            @Override // com.badlogic.gdx.utils.Json
            public <T> T readValue(Class<T> cls, Class cls2, JsonValue jsonValue) {
                return (jsonValue == null || !jsonValue.isString() || ClassReflection.isAssignableFrom(CharSequence.class, cls)) ? (T) super.readValue(cls, cls2, jsonValue) : (T) Skin.this.get(jsonValue.asString(), cls);
            }
        };
        json.setTypeName(null);
        json.setUsePrototypes(false);
        json.setSerializer(Skin.class, new Json.ReadOnlySerializer<Skin>() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Skin.2
            private void readNamedObjects(Json json2, Class cls, JsonValue jsonValue) {
                Class cls2 = cls == TintedDrawable.class ? Drawable.class : cls;
                for (JsonValue jsonValue2 = jsonValue.child; jsonValue2 != null; jsonValue2 = jsonValue2.next) {
                    Object value = json2.readValue(cls, jsonValue2);
                    if (value != null) {
                        try {
                            Skin.this.add(jsonValue2.name, value, cls2);
                            if (cls2 != Drawable.class && ClassReflection.isAssignableFrom(Drawable.class, cls2)) {
                                Skin.this.add(jsonValue2.name, value, Drawable.class);
                            }
                        } catch (Exception e) {
                            throw new SerializationException("Error reading " + ClassReflection.getSimpleName(cls) + ": " + jsonValue2.name, e);
                        }
                    }
                }
            }

            @Override // com.badlogic.gdx.utils.Json.ReadOnlySerializer, com.badlogic.gdx.utils.Json.Serializer
            public Skin read(Json json2, JsonValue jsonValue, Class cls) {
                for (JsonValue jsonValue2 = jsonValue.child; jsonValue2 != null; jsonValue2 = jsonValue2.next) {
                    try {
                        Class clsForName = json2.getClass(jsonValue2.name());
                        if (clsForName == null) {
                            clsForName = ClassReflection.forName(jsonValue2.name());
                        }
                        readNamedObjects(json2, clsForName, jsonValue2);
                    } catch (ReflectionException e) {
                        throw new SerializationException(e);
                    }
                }
                return this;
            }
        });
        json.setSerializer(BitmapFont.class, new Json.ReadOnlySerializer<BitmapFont>() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Skin.3
            @Override // com.badlogic.gdx.utils.Json.ReadOnlySerializer, com.badlogic.gdx.utils.Json.Serializer
            public BitmapFont read(Json json2, JsonValue jsonValue, Class cls) {
                BitmapFont bitmapFont;
                String str = (String) json2.readValue("file", String.class, jsonValue);
                float fFloatValue = ((Float) json2.readValue("scaledSize", (Class<Float>) Float.TYPE, Float.valueOf(-1.0f), jsonValue)).floatValue();
                Boolean bool = Boolean.FALSE;
                Boolean bool2 = (Boolean) json2.readValue("flip", (Class<Boolean>) Boolean.class, bool, jsonValue);
                Boolean bool3 = (Boolean) json2.readValue("markupEnabled", (Class<Boolean>) Boolean.class, bool, jsonValue);
                Boolean bool4 = (Boolean) json2.readValue("useIntegerPositions", (Class<Boolean>) Boolean.class, Boolean.TRUE, jsonValue);
                FileHandle fileHandleChild = fileHandle.parent().child(str);
                if (!fileHandleChild.exists()) {
                    fileHandleChild = Gdx.files.internal(str);
                }
                if (!fileHandleChild.exists()) {
                    throw new SerializationException(AbstractC5044xl.k("Font file not found: ", fileHandleChild));
                }
                String strNameWithoutExtension = fileHandleChild.nameWithoutExtension();
                try {
                    Array<TextureRegion> regions = this.getRegions(strNameWithoutExtension);
                    if (regions != null) {
                        bitmapFont = new BitmapFont(new BitmapFont.BitmapFontData(fileHandleChild, bool2.booleanValue()), regions, true);
                    } else {
                        TextureRegion textureRegion = (TextureRegion) this.optional(strNameWithoutExtension, TextureRegion.class);
                        if (textureRegion != null) {
                            bitmapFont = new BitmapFont(fileHandleChild, textureRegion, bool2.booleanValue());
                        } else {
                            FileHandle fileHandleChild2 = fileHandleChild.parent().child(strNameWithoutExtension + ".png");
                            bitmapFont = fileHandleChild2.exists() ? new BitmapFont(fileHandleChild, fileHandleChild2, bool2.booleanValue()) : new BitmapFont(fileHandleChild, bool2.booleanValue());
                        }
                    }
                    bitmapFont.getData().markupEnabled = bool3.booleanValue();
                    bitmapFont.setUseIntegerPositions(bool4.booleanValue());
                    if (fFloatValue != -1.0f) {
                        bitmapFont.getData().setScale(fFloatValue / bitmapFont.getCapHeight());
                    }
                    return bitmapFont;
                } catch (RuntimeException e) {
                    throw new SerializationException(AbstractC5044xl.k("Error loading bitmap font: ", fileHandleChild), e);
                }
            }
        });
        json.setSerializer(Color.class, new Json.ReadOnlySerializer<Color>() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Skin.4
            @Override // com.badlogic.gdx.utils.Json.ReadOnlySerializer, com.badlogic.gdx.utils.Json.Serializer
            public Color read(Json json2, JsonValue jsonValue, Class cls) {
                if (jsonValue.isString()) {
                    return (Color) Skin.this.get(jsonValue.asString(), Color.class);
                }
                String str = (String) json2.readValue("hex", (Class<Object>) String.class, (Object) null, jsonValue);
                if (str != null) {
                    return Color.valueOf(str);
                }
                Class cls2 = Float.TYPE;
                return new Color(((Float) json2.readValue("r", (Class<Float>) cls2, Float.valueOf(0.0f), jsonValue)).floatValue(), ((Float) json2.readValue("g", (Class<Float>) cls2, Float.valueOf(0.0f), jsonValue)).floatValue(), ((Float) json2.readValue(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, (Class<Float>) cls2, Float.valueOf(0.0f), jsonValue)).floatValue(), ((Float) json2.readValue("a", (Class<Float>) cls2, Float.valueOf(1.0f), jsonValue)).floatValue());
            }
        });
        json.setSerializer(TintedDrawable.class, new Json.ReadOnlySerializer() { // from class: com.badlogic.gdx.scenes.scene2d.ui.Skin.5
            @Override // com.badlogic.gdx.utils.Json.ReadOnlySerializer, com.badlogic.gdx.utils.Json.Serializer
            public Object read(Json json2, JsonValue jsonValue, Class cls) {
                String str = (String) json2.readValue("name", String.class, jsonValue);
                Color color = (Color) json2.readValue("color", Color.class, jsonValue);
                if (color == null) {
                    throw new SerializationException("TintedDrawable missing color: " + jsonValue);
                }
                Drawable drawableNewDrawable = Skin.this.newDrawable(str, color);
                if (drawableNewDrawable instanceof BaseDrawable) {
                    StringBuilder sb = new StringBuilder();
                    AbstractC5044xl.t(sb, jsonValue.name, " (", str, ", ");
                    sb.append(color);
                    sb.append(")");
                    ((BaseDrawable) drawableNewDrawable).setName(sb.toString());
                }
                return drawableNewDrawable;
            }
        });
        ObjectMap.Entries<String, Class> it = this.jsonClassTags.iterator();
        while (it.hasNext()) {
            ObjectMap.Entry next = it.next();
            json.addClassTag((String) next.key, (Class) next.value);
        }
        return json;
    }

    public NinePatch getPatch(String str) {
        int[] iArrFindValue;
        NinePatch ninePatch = (NinePatch) optional(str, NinePatch.class);
        if (ninePatch != null) {
            return ninePatch;
        }
        try {
            TextureRegion region = getRegion(str);
            if ((region instanceof TextureAtlas.AtlasRegion) && (iArrFindValue = ((TextureAtlas.AtlasRegion) region).findValue("split")) != null) {
                ninePatch = new NinePatch(region, iArrFindValue[0], iArrFindValue[1], iArrFindValue[2], iArrFindValue[3]);
                int[] iArrFindValue2 = ((TextureAtlas.AtlasRegion) region).findValue("pad");
                if (iArrFindValue2 != null) {
                    ninePatch.setPadding(iArrFindValue2[0], iArrFindValue2[1], iArrFindValue2[2], iArrFindValue2[3]);
                }
            }
            if (ninePatch == null) {
                ninePatch = new NinePatch(region);
            }
            float f = this.scale;
            if (f != 1.0f) {
                ninePatch.scale(f, f);
            }
            add(str, ninePatch, NinePatch.class);
            return ninePatch;
        } catch (GdxRuntimeException unused) {
            throw new GdxRuntimeException(AbstractC3888ke0.i("No NinePatch, TextureRegion, or Texture registered with name: ", str));
        }
    }

    public TextureRegion getRegion(String str) {
        TextureRegion textureRegion = (TextureRegion) optional(str, TextureRegion.class);
        if (textureRegion != null) {
            return textureRegion;
        }
        Texture texture = (Texture) optional(str, Texture.class);
        if (texture == null) {
            throw new GdxRuntimeException(AbstractC3888ke0.i("No TextureRegion or Texture registered with name: ", str));
        }
        TextureRegion textureRegion2 = new TextureRegion(texture);
        add(str, textureRegion2, TextureRegion.class);
        return textureRegion2;
    }

    @Null
    public Array<TextureRegion> getRegions(String str) {
        TextureRegion textureRegion = (TextureRegion) optional(str + "_0", TextureRegion.class);
        if (textureRegion == null) {
            return null;
        }
        Array<TextureRegion> array = new Array<>();
        int i = 1;
        while (textureRegion != null) {
            array.add(textureRegion);
            textureRegion = (TextureRegion) optional(str + "_" + i, TextureRegion.class);
            i++;
        }
        return array;
    }

    public Sprite getSprite(String str) {
        Sprite sprite = (Sprite) optional(str, Sprite.class);
        if (sprite != null) {
            return sprite;
        }
        try {
            TextureRegion region = getRegion(str);
            if (region instanceof TextureAtlas.AtlasRegion) {
                TextureAtlas.AtlasRegion atlasRegion = (TextureAtlas.AtlasRegion) region;
                if (atlasRegion.rotate || atlasRegion.packedWidth != atlasRegion.originalWidth || atlasRegion.packedHeight != atlasRegion.originalHeight) {
                    sprite = new TextureAtlas.AtlasSprite(atlasRegion);
                }
            }
            if (sprite == null) {
                sprite = new Sprite(region);
            }
            if (this.scale != 1.0f) {
                sprite.setSize(sprite.getWidth() * this.scale, sprite.getHeight() * this.scale);
            }
            add(str, sprite, Sprite.class);
            return sprite;
        } catch (GdxRuntimeException unused) {
            throw new GdxRuntimeException(AbstractC3888ke0.i("No NinePatch, TextureRegion, or Texture registered with name: ", str));
        }
    }

    public TiledDrawable getTiledDrawable(String str) {
        TiledDrawable tiledDrawable = (TiledDrawable) optional(str, TiledDrawable.class);
        if (tiledDrawable != null) {
            return tiledDrawable;
        }
        TiledDrawable tiledDrawable2 = new TiledDrawable(getRegion(str));
        tiledDrawable2.setName(str);
        if (this.scale != 1.0f) {
            scale(tiledDrawable2);
            tiledDrawable2.setScale(this.scale);
        }
        add(str, tiledDrawable2, TiledDrawable.class);
        return tiledDrawable2;
    }

    public boolean has(String str, Class cls) {
        ObjectMap<String, Object> objectMap = this.resources.get(cls);
        if (objectMap == null) {
            return false;
        }
        return objectMap.containsKey(str);
    }

    public void load(FileHandle fileHandle) {
        try {
            getJsonLoader(fileHandle).fromJson(Skin.class, fileHandle);
        } catch (SerializationException e) {
            throw new SerializationException(AbstractC5044xl.k("Error reading file: ", fileHandle), e);
        }
    }

    public Drawable newDrawable(String str) {
        return newDrawable(getDrawable(str));
    }

    @Null
    public <T> T optional(String str, Class<T> cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        ObjectMap<String, Object> objectMap = this.resources.get(cls);
        if (objectMap == null) {
            return null;
        }
        return (T) objectMap.get(str);
    }

    public void remove(String str, Class cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.resources.get(cls).remove(str);
    }

    public void scale(Drawable drawable) {
        drawable.setLeftWidth(drawable.getLeftWidth() * this.scale);
        drawable.setRightWidth(drawable.getRightWidth() * this.scale);
        drawable.setBottomHeight(drawable.getBottomHeight() * this.scale);
        drawable.setTopHeight(drawable.getTopHeight() * this.scale);
        drawable.setMinWidth(drawable.getMinWidth() * this.scale);
        drawable.setMinHeight(drawable.getMinHeight() * this.scale);
    }

    public void setEnabled(Actor actor, boolean z) {
        Method methodFindMethod = findMethod(actor.getClass(), "getStyle");
        if (methodFindMethod == null) {
            return;
        }
        try {
            Object objInvoke = methodFindMethod.invoke(actor, new Object[0]);
            String strFind = find(objInvoke);
            if (strFind == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strFind.replace("-disabled", ""));
            sb.append(z ? "" : "-disabled");
            Object obj = get(sb.toString(), objInvoke.getClass());
            Method methodFindMethod2 = findMethod(actor.getClass(), "setStyle");
            if (methodFindMethod2 == null) {
                return;
            }
            methodFindMethod2.invoke(actor, obj);
        } catch (Exception unused) {
        }
    }

    public void setScale(float f) {
        this.scale = f;
    }

    public void add(String str, Object obj, Class cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        if (obj == null) {
            throw new IllegalArgumentException("resource cannot be null.");
        }
        ObjectMap<String, Object> objectMap = this.resources.get(cls);
        if (objectMap == null) {
            objectMap = new ObjectMap<>((cls == TextureRegion.class || cls == Drawable.class || cls == Sprite.class) ? 256 : 64);
            this.resources.put(cls, objectMap);
        }
        objectMap.put(str, obj);
    }

    public <T> T get(String str, Class<T> cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (cls == Drawable.class) {
            return (T) getDrawable(str);
        }
        if (cls == TextureRegion.class) {
            return (T) getRegion(str);
        }
        if (cls == NinePatch.class) {
            return (T) getPatch(str);
        }
        if (cls == Sprite.class) {
            return (T) getSprite(str);
        }
        ObjectMap<String, Object> objectMap = this.resources.get(cls);
        if (objectMap == null) {
            throw new GdxRuntimeException("No " + cls.getName() + " registered with name: " + str);
        }
        T t = (T) objectMap.get(str);
        if (t != null) {
            return t;
        }
        throw new GdxRuntimeException("No " + cls.getName() + " registered with name: " + str);
    }

    public Drawable newDrawable(String str, float f, float f2, float f3, float f4) {
        return newDrawable(getDrawable(str), new Color(f, f2, f3, f4));
    }

    public Drawable newDrawable(String str, Color color) {
        return newDrawable(getDrawable(str), color);
    }

    public Drawable newDrawable(Drawable drawable) {
        if (drawable instanceof TiledDrawable) {
            return new TiledDrawable((TiledDrawable) drawable);
        }
        if (drawable instanceof TextureRegionDrawable) {
            return new TextureRegionDrawable((TextureRegionDrawable) drawable);
        }
        if (drawable instanceof NinePatchDrawable) {
            return new NinePatchDrawable((NinePatchDrawable) drawable);
        }
        if (drawable instanceof SpriteDrawable) {
            return new SpriteDrawable((SpriteDrawable) drawable);
        }
        throw new GdxRuntimeException("Unable to copy, unknown drawable type: " + drawable.getClass());
    }

    public Skin(FileHandle fileHandle) {
        Class[] clsArr = defaultTagClasses;
        this.jsonClassTags = new ObjectMap<>(clsArr.length);
        for (Class cls : clsArr) {
            this.jsonClassTags.put(cls.getSimpleName(), cls);
        }
        FileHandle fileHandleSibling = fileHandle.sibling(fileHandle.nameWithoutExtension() + ".atlas");
        if (fileHandleSibling.exists()) {
            TextureAtlas textureAtlas = new TextureAtlas(fileHandleSibling);
            this.atlas = textureAtlas;
            addRegions(textureAtlas);
        }
        load(fileHandle);
    }

    public Drawable newDrawable(Drawable drawable, float f, float f2, float f3, float f4) {
        return newDrawable(drawable, new Color(f, f2, f3, f4));
    }

    public Drawable newDrawable(Drawable drawable, Color color) {
        Drawable drawableTint;
        if (drawable instanceof TextureRegionDrawable) {
            drawableTint = ((TextureRegionDrawable) drawable).tint(color);
        } else if (drawable instanceof NinePatchDrawable) {
            drawableTint = ((NinePatchDrawable) drawable).tint(color);
        } else if (drawable instanceof SpriteDrawable) {
            drawableTint = ((SpriteDrawable) drawable).tint(color);
        } else {
            throw new GdxRuntimeException("Unable to copy, unknown drawable type: " + drawable.getClass());
        }
        if (drawableTint instanceof BaseDrawable) {
            BaseDrawable baseDrawable = (BaseDrawable) drawableTint;
            if (drawable instanceof BaseDrawable) {
                baseDrawable.setName(((BaseDrawable) drawable).getName() + " (" + color + ")");
            } else {
                baseDrawable.setName(" (" + color + ")");
            }
        }
        return drawableTint;
    }

    public Skin(FileHandle fileHandle, TextureAtlas textureAtlas) {
        Class[] clsArr = defaultTagClasses;
        this.jsonClassTags = new ObjectMap<>(clsArr.length);
        for (Class cls : clsArr) {
            this.jsonClassTags.put(cls.getSimpleName(), cls);
        }
        this.atlas = textureAtlas;
        addRegions(textureAtlas);
        load(fileHandle);
    }

    public Skin(TextureAtlas textureAtlas) {
        Class[] clsArr = defaultTagClasses;
        this.jsonClassTags = new ObjectMap<>(clsArr.length);
        for (Class cls : clsArr) {
            this.jsonClassTags.put(cls.getSimpleName(), cls);
        }
        this.atlas = textureAtlas;
        addRegions(textureAtlas);
    }
}

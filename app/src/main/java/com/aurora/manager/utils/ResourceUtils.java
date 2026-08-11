package com.aurora.manager.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

public class ResourceUtils {

    public static String getString(Context context, @StringRes int resId) {
        return context.getResources().getString(resId);
    }

    public static String getString(Context context, @StringRes int resId, Object... args) {
        return context.getResources().getString(resId, args);
    }

    public static float getDimen(Context context, @DimenRes int resId) {
        return context.getResources().getDimension(resId);
    }

    public static int getDimenPx(Context context, @DimenRes int resId) {
        return context.getResources().getDimensionPixelSize(resId);
    }

    @ColorInt
    public static int getColor(Context context, @ColorRes int resId) {
        return ContextCompat.getColor(context, resId);
    }

    public static ColorStateList getColorStateList(Context context, @ColorRes int resId) {
        return ContextCompat.getColorStateList(context, resId);
    }

    public static Drawable getDrawable(Context context, @DrawableRes int resId) {
        return ContextCompat.getDrawable(context, resId);
    }

    public static Typeface getFont(Context context, @FontRes int resId) {
        return ResourcesCompat.getFont(context, resId);
    }

    public static int getDp(Context context, float value) {
        return Math.round(value * context.getResources().getDisplayMetrics().density);
    }

    public static int getSp(Context context, float value) {
        return Math.round(value * context.getResources().getDisplayMetrics().scaledDensity);
    }
}
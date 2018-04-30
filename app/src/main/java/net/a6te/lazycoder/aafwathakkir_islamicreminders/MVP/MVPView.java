package net.a6te.lazycoder.aafwathakkir_islamicreminders.MVP;

import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.ArrayAdapter;

import net.a6te.lazycoder.aafwathakkir_islamicreminders.adapters.CustomSuggestionsAdapter;
import net.a6te.lazycoder.aafwathakkir_islamicreminders.adapters.PrayerTimeAdapter;

import java.util.List;

public interface MVPView {
    interface HomeView{

        void storeBitMapImage(Bitmap bitmap);

        void shareImage(Intent shareIntent);
    }
    interface PrayerTimeView{

        void initializeRecyclerView(PrayerTimeAdapter adapter);


        void setCityName(String cityName);
    }
    interface QiblaView{
        void setQiblaInfo(String qiblaDegree, String qiblaDistance);

        //this will generate new compass direction
        void changeCompassDirection(float directionsNorth, float directionsQibla, float degree);

        void notifyNoInternetConnection();

        void showSensorNotAvailable();

        void notifyNotEnabledGPS();
    }
    interface QuranView{
        void initializeSearchView(CustomSuggestionsAdapter adapter);
    }
    interface SettingsView{
        void initializeLanguageSpinner(ArrayAdapter adapter);

        void initializeFrequencySpinner(ArrayAdapter adapter);
        void initializePrayerTimeCalculationSpinner(ArrayAdapter adapter);
        void initializeJuristicSpinner(ArrayAdapter adapter);

        void initializeRemainderLanguage(ArrayAdapter adapter);
    }

}

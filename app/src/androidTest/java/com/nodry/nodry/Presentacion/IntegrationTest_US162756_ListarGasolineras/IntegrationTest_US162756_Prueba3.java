package com.nodry.nodry.Presentacion.IntegrationTest_US162756_ListarGasolineras;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.nodry.nodry.Presentacion.MainActivity;
import com.nodry.nodry.R;
import com.nodry.nodry.Utils.DataFetch;
import com.nodry.nodry.Utils.Utils;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

/**
 *  Listar gasolineras
 * US162756_Prueba3
 *
 *  Implementado por Andrés Barrado
 *
 * 	PRUEBA 3 – Error en la conexión a internet
 1. El usuario abre la aplicación.
 2. La aplicación muestra un diálogo para indicar al usuario que se están cargando los datos.
 3. La aplicación no consigue descargar los datos y alerta al usuario de la imposibilidad de obtener los datos mediante un mensaje.


 */

@LargeTest
@RunWith(AndroidJUnit4.class)
public class IntegrationTest_US162756_Prueba3 {

    private static final String EXPECTED_MSG = "No hay conexión de datos.";

    @BeforeClass
    public static void setUpClass() throws Exception {
        Utils.setContext(InstrumentationRegistry.getTargetContext());
    }

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void integrationTest3() {
        onView(withText(EXPECTED_MSG)).inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));
    }

}

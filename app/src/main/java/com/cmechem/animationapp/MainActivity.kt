//This app demonstrates various ways of animating movement and color change
//Written by Aaron Gordon - September, 2016 - Kotlin March, 2018

package com.cmechem.animationapp


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.cmechem.animationapp.R.id.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    private var cb: ChalkBoard? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        cb = ChalkBoard(this)      //Attach ChalkBoard to the Activity
        backgroundLayout.addView(cb)
        fab.setOnClickListener {
            cb!!.wander()                    //when button clicked, do animation in ChalkBoard
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Set which animation to perform on next Button click
        val id = item.itemId

        when (id) {
            grow -> {
                cb!!.setStyle((ChalkBoard.GROW))
            }
            test -> {
                cb!!.setStyle(ChalkBoard.SHRINK)
            }
            raw_animation -> {
                cb!!.setStyle(ChalkBoard.RAW)
                return true
            }
            obj_animation -> {
                cb!!.setStyle(ChalkBoard.ANIMATOR)
                return true
            }
            accelorate_animation -> {
                cb!!.setStyle(ChalkBoard.ACCELERATOR)
                return true
            }
            decelorate_animation -> {
                cb!!.setStyle(ChalkBoard.DECELERATE)
                return true
            }
            bounce_animation -> {
                cb!!.setStyle(ChalkBoard.BOUNCE)
                return true
            }
            rotate_animation -> {
                cb!!.setStyle(ChalkBoard.ROTATE)
                return true
            }
            moverotate_animation -> {
                cb!!.setStyle(ChalkBoard.MOVE_ROTATE)
                return true
            }
            color_animation -> {
                cb!!.setStyle(ChalkBoard.COLOR_ACC)
                return true
            }
            movecolor_animation -> {
                cb!!.setStyle(ChalkBoard.MOVE_RECOLOR)
                return true
            }
            moverotatecolor_animation -> {
                cb!!.setStyle(ChalkBoard.MOVE_ROTATE_RECOLOR)
                return true
            }
            else -> {
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
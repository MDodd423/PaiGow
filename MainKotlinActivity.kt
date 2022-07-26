package tech.dodd.paigow

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import tech.dodd.paigow.databinding.ActivityMainBinding

class MainKotlinActivity : AppCompatActivity() {
    private var numLow = 0
    private lateinit var binding: ActivityMainBinding
    private lateinit var cards: MutableList<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.handlers = this

        cards = mutableListOf(101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113)

        deal()
    }

    fun doClick(v: View) {
        binding.apply {
            when (v.id) {
                R.id.Card1text -> {
                    clickHL(Card1text)
                }
                R.id.Card2text -> {
                    clickHL(Card2text)
                }
                R.id.Card3text -> {
                    clickHL(Card3text)
                }
                R.id.Card4text -> {
                    clickHL(Card4text)
                }
                R.id.Card5text -> {
                    clickHL(Card5text)
                }
                R.id.Card6text -> {
                    clickHL(Card6text)
                }
                R.id.Card7text -> {
                    clickHL(Card7text)
                }
                R.id.iSolveButton -> {
                    solve()
                }
                R.id.uSolveButton -> {
                    solve()
                }
                R.id.NextButton -> {
                    deal()
                }
            }
        }
    }

    private fun clickHL(text: TextView) {
        if (text.text == "Low") {
            text.text = null
            numLow -= 1
        } else if (numLow < 2) {
            text.setText(R.string.lowtext)
            numLow += 1
        }
    }

    private fun deal() {
        numLow = 0
        cards.shuffle()
        binding.apply {
            assignCardValues(cards[0] as Int, Card1text)
            assignCardValues(cards[1] as Int, Card2text)
            assignCardValues(cards[2] as Int, Card3text)
            assignCardValues(cards[3] as Int, Card4text)
            assignCardValues(cards[4] as Int, Card5text)
            assignCardValues(cards[5] as Int, Card6text)
            assignCardValues(cards[6] as Int, Card7text)
            Card1text.text = null
            Card2text.text = null
            Card3text.text = null
            Card4text.text = null
            Card5text.text = null
            Card6text.text = null
            Card7text.text = null
        }
    }

    private fun solve() {}

    private fun assignCardValues(card: Int, text: TextView) {
        when (card) {
            101 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.ace, null), null, null)
            }
            102 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.two, null), null, null)
            }
            103 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.three, null), null, null)
            }
            104 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.four, null), null, null)
            }
            105 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.five, null), null, null)
            }
            106 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.six, null), null, null)
            }
            107 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.seven, null), null, null)
            }
            108 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.eight, null), null, null)
            }
            109 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.nine, null), null, null)
            }
            110 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.ten, null), null, null)
            }
            111 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.jack, null), null, null)
            }
            112 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.queen, null), null, null)
            }
            113 -> {
                text.setCompoundDrawablesWithIntrinsicBounds(null, ResourcesCompat.getDrawable(resources, R.drawable.king, null), null, null)
            }
        }
    }
}
package com.animals.safety.adapter

import com.animals.safety.data.Animal

interface OnAnimalClickListener {
  
  fun onClick(animal: Animal?)
  
}
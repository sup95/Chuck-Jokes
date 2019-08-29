//
//  ViewController.swift
//  ios-app
//
//  Created by Jamie Lynch on 30/01/2019.
//  Copyright © 2019 Jamie Lynch. All rights reserved.
//

import UIKit
import main

class ViewController: UIViewController, UITableViewDelegate, UITextFieldDelegate {
    
    private let languageFacts = LanguageFactRepository().fetchLanguageFacts()
    
    @IBOutlet weak var jokeLabel: UILabel!
    @IBOutlet weak var yourNameInput: UITextField!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        jokeLabel.text = ""
    }
    
    @IBAction func showMessage(sender: UIButton) {
        let name: String = yourNameInput.text!
        let joke = JokeMachine().pokeAJoke(name: name)
        jokeLabel.text = joke
    }
    
}
